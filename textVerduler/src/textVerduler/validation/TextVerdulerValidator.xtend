/*
 * generated by Xtext
 */
package textVerduler.validation

import org.eclipse.xtext.validation.Check
import textVerduler.textVerduler.Verduleria
import static extension model.VerduleriaExtensions.*
import static extension model.ProductoExtensions.*
import static extension model.NameExtensions.*
import java.util.List
import textVerduler.textVerduler.TextVerdulerPackage
import textVerduler.textVerduler.Venta
import textVerduler.textVerduler.ProductoConPrecio
import org.eclipse.emf.ecore.EObject

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TextVerdulerValidator extends AbstractTextVerdulerValidator {

	@Check
	def checkClienteNoExiste(Verduleria verduleria) {
		checkElementosRepetidos(verduleria.clientes, TextVerdulerPackage.CLIENTE__NAME)
	}

	@Check
	def checkProductoNoExiste(Verduleria verduleria) {
		checkElementosRepetidos(verduleria.productos, TextVerdulerPackage.PRODUCTO__NAME)
	}
	
	def checkElementosRepetidos(List<? extends EObject> lista, int errorMsg) {
		val List<String> nombres = newArrayList()
		lista.forEach [ elemento |
			if (nombres.contains(elemento.name.toString.toLowerCase))
				error(
					'''El elemento ya existe.''',
					elemento,
					elemento.eClass.getEStructuralFeature(
						errorMsg
					)
				)
			else
				nombres.add(elemento.name.toString.toLowerCase)
		]
	}
	
	@Check
	def checkProductoPluralOSingular(Verduleria verduleria) {
		val List<String> nombres = newArrayList()
		verduleria.productos.forEach [ producto |
			var String productoASingular
			var String productoAPlural
			productoASingular = producto.name
			productoAPlural = producto.name.toPlural
			if (productoAPlural == producto.name) {
				productoASingular = producto.name.toSingular
			}
			if (nombres.contains(productoASingular) || nombres.contains(producto.name) ||
				nombres.contains(productoAPlural))
				error(
					"El producto ya existe, plural o singular es lo mismo",
					producto,
					producto.eClass.getEStructuralFeature(
						TextVerdulerPackage.PRODUCTO__NAME
					)
				)
			else
				nombres.add(producto.name)
		]
	}

	def getToSingular(String unNombre) {
		if (unNombre.endsWith('s'))
			unNombre.substring(0, unNombre.length - 1)
		else {
			if (unNombre.endsWith('es'))
				unNombre.substring(0, unNombre.length - 2)
		}
	}

	def toPlural(String unNombre) {
		if (unNombre.endsWith('s') || unNombre.endsWith('es'))
			unNombre
		else {
			if (terminaConVocal(unNombre))
				unNombre.concat('s')
			else
				unNombre.concat('es')
		}
	}
	
	def terminaConVocal(String unNombre) {
		newArrayList('a', 'e', 'i', 'o', 'u').exists[unNombre.endsWith(it)]
	}
	
	@Check
	def checkPrecioPorKilo(ProductoConPrecio producto) {
		if (producto.precioEnKilos > 200)
			error(
				"El producto no puede valer mas de 200 pesos el kilo.",
				producto,
				producto.eClass.getEStructuralFeature(
					TextVerdulerPackage.VALOR_DEL_PRODUCTO__DESCRIPCION
				)
			)

	}

	@Check
	def checkPagoDelCliente(Venta venta) {
		if (venta.total.estado == "queda debiendo" && venta.total.importe.valor > 3) {
			error(
				"No se le pueden fiar mas de 3 pesos al cliente.",
				venta,
				venta.eClass.getEStructuralFeature(
					TextVerdulerPackage.VENTA__TOTAL
				)
			)
		}
	}

	@Check
	def checkCantidadDeProductoPorCompra(Verduleria verduleria) {
		verduleria.ventas.forEach [ venta |
			venta.listaDeProductos.forEach [ mercaderia |
				val productoOriginal = verduleria.productosConPrecio.findFirst [
					it.producto.name == mercaderia.producto.name
				]
				if (productoOriginal.valor.descripcion.cantidad.unidad == "gramos" &&
					(mercaderia.descripcion.cantidad > 4 && mercaderia.descripcion.unidad == "kilos"))
					error(
						"El maximo de este producto por compra es de 4 kg.",
						mercaderia,
						mercaderia.eClass.getEStructuralFeature(TextVerdulerPackage.MERCADERIA__DESCRIPCION)
					)
				else if (mercaderia.descripcion.cantidad > 20 && mercaderia.descripcion.unidad == "kilos")
					error(
						"El maximo de este producto por compra es de 20 kg.",
						mercaderia,
						mercaderia.eClass.getEStructuralFeature(TextVerdulerPackage.MERCADERIA__DESCRIPCION)
					)
			]
		]
	}
}
