package model

import textVerduler.textVerduler.Verduleria
import textVerduler.textVerduler.Venta
import static extension model.VentaExtensions.*

class VerduleriaExtensions {
	
	def static totalDeVentas(Verduleria unaVerdu){
		var valores=unaVerdu.anotaciones.filter(Venta).map[unImporte.valor]
		var resultado= 0
		for(valor: valores){
			resultado+=valor
		}
		resultado
	}
	
	def static gananciasTotales(Verduleria unaVerdu){
		var ganancias =unaVerdu.anotaciones.filter(Venta).map[ganancias]
		var resultado= 0
		for (ganancia: ganancias){
			resultado+= ganancia
		}
		resultado
	}
	
}