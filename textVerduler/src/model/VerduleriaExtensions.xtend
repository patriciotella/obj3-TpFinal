package model

import java.util.ArrayList
import textVerduler.textVerduler.ModelCliente
import textVerduler.textVerduler.Venta
import textVerduler.textVerduler.Verduleria

import static extension model.VentaExtensions.*
import textVerduler.textVerduler.ModelProducto

class VerduleriaExtensions {
	
	def static totalDeVentas(Verduleria unaVerdu){
		var valores=unaVerdu.anotaciones.filter(Venta).map[importe.valor]
		var resultado= 0
		for(valor: valores){
			resultado+=valor
		}
		resultado
	}
	
	def static gananciasTotales(Verduleria unaVerdu){
		var ganancias= unaVerdu.anotaciones.filter(Venta).map[ganancias]
		var resultado= 0
		for (ganancia: ganancias){
			resultado+= ganancia
		}
		resultado
	}
	
	def static getClientes(Verduleria unaVerdu){
		unaVerdu.anotaciones.filter(ModelCliente).map[clientes].flatten
	}
	
	def static getVentas(Verduleria unaVerdu){
		unaVerdu.anotaciones.filter(Venta)
	}
	
	def static getProductos(Verduleria unaVerdu){
		unaVerdu.anotaciones.filter(ModelProducto).map[productos].flatten
	}
	
	def static getProductosVendidos(Iterable<Venta> ventas){
		var ArrayList<String> vendidos
		for( venta : ventas){
			vendidos.addAll(venta.listaDeProductos.map[it.producto.name])
		}
		return vendidos
	}
}