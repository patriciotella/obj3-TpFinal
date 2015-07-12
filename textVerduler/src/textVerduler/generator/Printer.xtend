package textVerduler.generator

import textVerduler.textVerduler.Verduleria
import java.util.List
import textVerduler.textVerduler.Cliente
import static extension model.VerduleriaExtensions.*

class Printer {
	def mostrarClientes(List<Cliente> clientes, String title) {
		'''
			«title»: «
						clientes.fold("") [result, cliente |
							agregarNombreA(result, cliente.name, clientes.map[name])
						]
					 »
		'''
	}
	
	def mostrarClientesConBalance(List<Cliente> clientes, String title, (Cliente)=>int block) {
		'''
			«title»: «
						clientes.fold("") [result, cliente |
							agregarCliente(result, cliente, '''« block.apply(cliente) » pesos''',  clientes)
						]
					 »
		'''
	}
	
	def mostrarTotalesDe(Verduleria unaVerduleria) {
		'''
			Se vendio por un total de «unaVerduleria.totalDeVentas» pesos.
			
			Se recaudaron en total «unaVerduleria.gananciasTotales» pesos.
		'''
	}
	
	def mostrarProductosVendidos(Verduleria unaVerduleria) {
		'''
			«FOR producto : unaVerduleria.productosVendidos»
				« capitalize(producto) », total vendido « unaVerduleria.totalVendidoDe(producto) » kilos
			«ENDFOR»
		'''
	}
	
	def mostrarProductosSinVender(Verduleria unaVerduleria) {
		val productos = unaVerduleria.productosSinVender.map[name].toList
		'''
			No se vendieron: «
								productos.fold("") [result, name |
									agregarNombreA(result, name.toLowerCase, productos)
								]
							 »
		'''
	}
	
	def agregarNombreA(String resultado, String nombre, List<String> nombres) {
		resultado + nombre + 
			if(nombres.indexOf(nombre) !=  nombres.size - 1) ', '
			else ''
	}
	
	def agregarCliente(String resultado, Cliente cliente, String datos, List<Cliente> clientes) {
		resultado + cliente.name + " " + datos + 
			if(clientes.indexOf(cliente) !=  clientes.size - 1) ', '
			else ''
	}
	
	def capitalize(String unNombre) {
		unNombre.substring(0, 1).toUpperCase() + unNombre.substring(1)
	}
}