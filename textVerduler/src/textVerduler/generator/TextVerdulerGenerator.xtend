/*
 * generated by Xtext
 */
package textVerduler.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import textVerduler.textVerduler.Venta
import textVerduler.textVerduler.Verduleria

import static extension model.VentaExtensions.*
import static extension model.VerduleriaExtensions.*
import textVerduler.textVerduler.Cliente

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TextVerdulerGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val verdu = resource.allContents.filter(Verduleria).head
		val total = verdu.totalDeVentas
		val totalEnCaja = verdu.gananciasTotales
		val clientes = verdu.clientes
		val ventas = verdu.ventas
//		val productos= verdu.productos
//		val productosVendidos=ventas.productosVendidos

		fsa.generateFile(
			'verduleria.txt',
			'''Totales:
			
			Se vendio por un total de «total» pesos.
			
			Se recaudaron en total «totalEnCaja» pesos.
			
			Clientes:
			
			Deben: 
			«FOR cliente : clientes»
			« IF(ventas.balanceCliente(cliente)<0) »
			« cliente.name » « - ventas.balanceCliente(cliente) » pesos 
			« ENDIF »
			«ENDFOR»
			
			Tienen credito: 
			«FOR cliente : clientes»
			« IF(ventas.balanceCliente(cliente)>0) »
			« cliente.name » « ventas.balanceCliente(cliente) » pesos 
			« ENDIF »
			«ENDFOR»
			
			Al dia: 
			«FOR cliente : clientes»
			« IF(!ventas.forall[venta | venta.cliente.name != cliente.name]) »
«««			hay que generalizarlo, lo puse para que no aparezca el que no compro
			« IF(ventas.balanceCliente(cliente)== 0) »
			« cliente.name » 
			« ENDIF »
			« ENDIF »
			«ENDFOR»
			
			No hicieron compras:
			«FOR cliente : clientes»
			« IF(ventas.forall[venta | venta.cliente.name != cliente]) »
			« cliente.name » 
			« ENDIF »
			«ENDFOR»
			
			Productos:
			
			No se vendieron:
«««			«FOR producto : productos»
«««			« IF(productosVendidos.forall[vendido | vendido!= producto]) »
«««			« producto» 
«««			« ENDIF »
«««			«ENDFOR»
			'''
		)
	}

	def int balanceCliente(Iterable<Venta> ventas, Cliente cliente) {
		var resultado = 0;
		for (venta : ventas) {
			if (venta.cliente.name == cliente.name) {
				resultado = resultado + venta.estadoDeCompra
			}
		}
		return resultado
	}
}
