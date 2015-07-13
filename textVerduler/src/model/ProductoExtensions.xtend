package model

import textVerduler.textVerduler.ProductoConPrecio
import textVerduler.textVerduler.RevisionDeProducto
import textVerduler.textVerduler.Mercaderia

class ProductoExtensions {
	def static precioEnKilos(ProductoConPrecio unProducto) {
		val unidad = unProducto.valor.descripcion.cantidad.unidad
		val cantidad = unProducto.valor.descripcion.cantidad.cantidad
		val precio = unProducto.valor.descripcion.importe.valor
		if(unidad == "kilos" || unidad == "kilo")
			return precio
		if(unidad == "gramos")
			return  precio / (cantidad / 1000.00f)
		if(unidad == "medio kilo")
			return precio * 2f
		if(unidad == "cuarto kilo")
			return precio * 4f
	}
	
	def static dispatch producto(RevisionDeProducto tarea) {
		tarea.producto
	}
	
	def static dispatch producto(Mercaderia mercaderia) {
		mercaderia.producto
	}
}