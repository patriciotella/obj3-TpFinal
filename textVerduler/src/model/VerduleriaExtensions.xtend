package model

import textVerduler.textVerduler.Verduleria

import static extension model.VentaExtensions.*
import textVerduler.textVerduler.Producto

class VerduleriaExtensions {
	
	def static totalDeVentas(Verduleria unaVerduleria){
		var valores=unaVerduleria.ventas.map[importe.valor]
		var resultado= 0
		for(valor: valores){
			resultado+=valor
		}
		resultado
	}
	
	def static gananciasTotales(Verduleria unaVerduleria){
		var ganancias= unaVerduleria.ventas.map[ganancias]
		var resultado= 0
		for (ganancia: ganancias){
			resultado+= ganancia
		}
		resultado
	}
	
	def static getClientes(Verduleria unaVerduleria){
		unaVerduleria.estadosDeClientes.map[cliente]
	}
	
	def static getProductos(Verduleria unaVerduleria){
		unaVerduleria.productosConPrecio.map[producto]
	}
	
	def static getProductosVendidos(Verduleria unaVerduleria){
		unaVerduleria.ventas.map[listaDeProductos].flatten.map[producto].toSet
	}
	
	def static getProductosSinVender(Verduleria unaVenduleria) {
		var resultado = newArrayList
		val productosVendidos = unaVenduleria.ventas.map[listaDeProductos].flatten.map[producto]
		for(producto : unaVenduleria.productos){
			if(!productosVendidos.exists[name == producto.name])
				resultado.add(producto)
		}
		resultado
	}
	
	def static totalVendidoDe(Verduleria unaVerduleria, Producto unProducto) {
		val compras = unaVerduleria.ventas.map[listaDeProductos].flatten.filter[producto.name == unProducto.name]
		var resultado = 0f
		for(compra : compras){
			val unidad = compra.descripcion.unidad
			val cantidad = compra.descripcion.cantidad
			if(unidad == "kilos" || unidad == "kilo")
				resultado += cantidad
			if(unidad == "gramos")
				resultado += (cantidad / 1000.00f)
			if(unidad == "medio kilo")
				resultado += 0.50f
			if(unidad == "cuarto kilo")
				resultado += 0.25f
		}
		resultado
	}
}