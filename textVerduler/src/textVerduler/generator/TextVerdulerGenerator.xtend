/*
 * generated by Xtext
 */
package textVerduler.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import textVerduler.textVerduler.Verduleria

import static extension model.VerduleriaExtensions.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TextVerdulerGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val verduleria = resource.allContents.filter(Verduleria).head
		val total = verduleria.totalDeVentas
		val totalEnCaja = verduleria.gananciasTotales
		val productosVendidos = verduleria.productosVendidos
		val productosSinVender = verduleria.productosSinVender.map[name].toList

		fsa.generateFile(
			'verduleria.txt',
			'''
				Totales:
				
					Se vendio por un total de «total» pesos.
				
					Se recaudaron en total «totalEnCaja» pesos.
				
				Clientes:
				
					Deben: 
						«FOR cliente : verduleria.deudores»
							« cliente.name » « - verduleria.balanceCliente(cliente) » pesos
						«ENDFOR»
				
					Tienen credito: 
						«FOR cliente : verduleria.clientesConDineroAFavor»
							« cliente.name » « verduleria.balanceCliente(cliente) » pesos
						«ENDFOR»
				
					Al dia: 
						«FOR cliente : verduleria.clientesAlDia»
							« cliente.name »
						«ENDFOR»
				
					No hicieron compras:
						«FOR cliente : verduleria.clientesQueNoCompraron»
							« cliente.name »
						«ENDFOR»
				
				Productos:
					«FOR producto : productosVendidos»
						« producto », total vendido « verduleria.totalVendidoDe(producto) » kilos
					«ENDFOR»
				
					No se vendieron:
						«
							productosSinVender.fold("") [result, name |
								result + name + 
									if(productosSinVender.indexOf(name) !=  productosSinVender.size - 1) ', '
									else ''
							]
						»
«««				«IF (!verduleria.hayConsultas.preguntas.isEmpty)»
«««					«archivoDeConsultas(fsa, verduleria)»
«««				«ENDIF»
			'''
		)

	}
	
	def archivoDeConsultas(IFileSystemAccess fsa, Verduleria unaVerduleria) {
		 val consultas = unaVerduleria.hayConsultas
		 fsa.generateFile(
		 'consultas.txt',
		 '''
		 	Me preguntas:
		 	«FOR consulta : consultas.preguntas»
				« consulta.descripcion » « consulta.cliente.name » .
			«ENDFOR» 
		 '''
		 ) 
	}
}