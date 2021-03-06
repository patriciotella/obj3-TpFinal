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
		val printer = new Printer
		fsa.generateFile(
			'verduleria.txt',
			'''
				Totales:
					« printer.mostrarTotalesDe(verduleria) »
				
				Clientes:
				
					« printer.mostrarClientesConBalance(verduleria.deudores.toList, 'Deben', [- verduleria.balanceCliente(it)]) »
					« printer.mostrarClientesConBalance(verduleria.clientesConDineroAFavor.toList, 'Tienen credito', [verduleria.balanceCliente(it)]) »
					« printer.mostrarClientes(verduleria.clientesAlDia.toList, "Al dia") »
					« printer.mostrarClientes(verduleria.clientesQueNoCompraron.toList, "No hicieron compras") »
				
				Productos:
				
					« printer.mostrarProductosVendidos(verduleria) »
					« printer.mostrarProductosSinVender(verduleria) »
					
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