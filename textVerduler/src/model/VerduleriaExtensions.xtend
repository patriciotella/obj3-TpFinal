package model

import textVerduler.textVerduler.Verduleria

import static extension model.VentaExtensions.*
import textVerduler.textVerduler.Producto
import textVerduler.textVerduler.Cliente

class VerduleriaExtensions {
	
	def static totalDeVentas(Verduleria unaVerduleria){
		unaVerduleria.ventas.map[importe.valor]
			.fold(0) [result, valor |
				result + valor
			]
	}
	
	def static gananciasTotales(Verduleria unaVerduleria){
		unaVerduleria.ventas.map[ganancias]
			.fold(0) [result, ganancia |
				result + ganancia
			]
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
	
	def static getProductosSinVender(Verduleria unaVerduleria) {
		val productosVendidos = unaVerduleria.ventas.map[listaDeProductos].flatten.map[producto]
		unaVerduleria.productos.filter[producto |
			!productosVendidos.exists[equals(producto)]
		]
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

	def static balanceCliente(Verduleria verduleria, Cliente cliente) {
		verduleria.ventas
			.filter[it.cliente == cliente]
			.fold(0) [result, venta |
				result + venta.estadoDeCompra
			]
	}
	
	def static deudores(Verduleria unaVerduleria) {
		unaVerduleria.clientes.filter[unaVerduleria.balanceCliente(it) < 0]
	}
	
	def static clientesAlDia(Verduleria unaVerduleria) {
		unaVerduleria.clientes.filter[unaVerduleria.balanceCliente(it) == 0]
	}
	
	def static clientesConDineroAFavor(Verduleria unaVerduleria) {
		unaVerduleria.clientes.filter[unaVerduleria.balanceCliente(it) > 0]
	}

	def static clientesQueNoCompraron(Verduleria unaVerduleria) {
		unaVerduleria.clientes.filter[unaVerduleria.noCompro(it)]
	}
	
	def static noCompro(Verduleria unaVerduleria, Cliente unCliente) {
		unaVerduleria.ventas.forall[it.cliente != unCliente]
	}
	def static hayConsultas(Verduleria unaVerduleria){
		unaVerduleria.consultas
	}	
}