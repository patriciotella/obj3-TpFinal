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
	
	def static toSingular(String unNombre) {
		if (unNombre.endsWith('s'))
			unNombre.substring(0, unNombre.length - 1)
		else {
			if (unNombre.endsWith('es'))
				unNombre.substring(0, unNombre.length - 2)
		}
	}

	def static toPlural(String unNombre) {
		if (unNombre.endsWith('s') || unNombre.endsWith('es'))
			unNombre
		else {
			if (terminaConVocal(unNombre))
				unNombre.concat('s')
			else
				unNombre.concat('es')
		}
	}
	
	def static terminaConVocal(String unNombre) {
		newArrayList('a', 'e', 'i', 'o', 'u').exists[unNombre.endsWith(it)]
	}
	
	def static sonNombresIguales(String unNombre, String otroNombre) {
		toPlural(unNombre.toLowerCase) == toPlural(otroNombre.toLowerCase)
	}
}