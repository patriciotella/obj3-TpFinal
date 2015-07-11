package model

import textVerduler.textVerduler.Verduleria

import static extension model.VentaExtensions.*
import static extension model.NameExtensions.*
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
		unaVerduleria.ventas.map[listaDeProductos].flatten.map[toPlural(producto.toLowerCase)].toSet
	}
	
	def static getProductosSinVender(Verduleria unaVerduleria) {
		unaVerduleria.productos.filter[producto |
			!unaVerduleria.productosVendidos.exists[sonNombresIguales(it, producto.name)]
		]
	}
	
	def static tieneProductoConNombre(Verduleria unaVerduleria, String unNombreDeProducto) {
		unaVerduleria.productos.map[name].exists[sonNombresIguales(it, unNombreDeProducto)]
	}
	
	def static comprasDe(Verduleria unaVerduleria, String unProducto) {
		unaVerduleria.ventas.map[listaDeProductos].flatten.filter[sonNombresIguales(producto, unProducto)]
	}
	
	def static totalVendidoDe(Verduleria unaVerduleria, String unProducto) {
		val compras = unaVerduleria.comprasDe(unProducto)
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