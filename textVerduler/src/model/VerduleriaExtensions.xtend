package model

import java.util.ArrayList
import textVerduler.textVerduler.ModelCliente
import textVerduler.textVerduler.Venta
import textVerduler.textVerduler.Verduleria

import static extension model.VentaExtensions.*
import textVerduler.textVerduler.ModelProducto

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
		var ganancias= unaVerdu.anotaciones.filter(Venta).map[ganancias]
		var resultado= 0
		for (ganancia: ganancias){
			resultado+= ganancia
		}
		resultado
	}
	
	def static getClientes(Verduleria unaVerdu){
		var clientes=unaVerdu.anotaciones.filter(ModelCliente).map[clientes].flatten
		var ArrayList<String> nombres= new ArrayList
		for(cliente : clientes){
			nombres.add(cliente.name)
		}
		return nombres
	}
	
	def static getVentas(Verduleria unaVerdu){
		var ventas= unaVerdu.anotaciones.filter(Venta)
		return ventas
	}
	
	def static getProductos(Verduleria unaVerdu){
		var productos=unaVerdu.anotaciones.filter(ModelProducto).map[productos].flatten
		var ArrayList<String> nombres= new ArrayList
		for(producto : productos){
			nombres.add(producto.name)
		}
		return nombres
	}
	
	def static getProductosVendidos(Iterable<Venta> ventas){
		var ArrayList<String> vendidos
		for( venta : ventas){
			vendidos.add(venta.unaListaDeCompras.unProducto.name)
		}
		return vendidos
	}
}