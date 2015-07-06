package model

import textVerduler.textVerduler.Producto
import textVerduler.textVerduler.Cliente

class NameExtensions {
	def static dispatch name(Cliente cliente) {
		cliente.name
	}
	
	def static dispatch name(Producto producto) {
		producto.name
	}
}