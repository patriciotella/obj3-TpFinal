package model

import textVerduler.textVerduler.Venta

class VentaExtensions {

	def static ganancias(Venta unaVenta) {
		if (unaVenta.importe.valor == unaVenta.total.importe.valor) {
			if (unaVenta.total.estado == "queda debiendo") {
				0
			} else {
				unaVenta.importe.valor
			}
		} else {
			if (unaVenta.importe.valor < unaVenta.total.importe.valor) {
				unaVenta.importe.valor - (unaVenta.total.importe.valor - unaVenta.importe.valor)
			} else {
				unaVenta.importe.valor - unaVenta.total.importe.valor
			}
		}
	}

	def static estadoDeCompra(Venta unaVenta) {
		if (unaVenta.total.estado == "queda debiendo") {
			- unaVenta.total.importe.valor
		} else {
			if (unaVenta.importe.valor == unaVenta.total.importe.valor) {
				0
			} else {
				if (unaVenta.importe.valor < unaVenta.total.importe.valor) {
					unaVenta.total.importe.valor - unaVenta.importe.valor
				} else {
					unaVenta.importe.valor - unaVenta.total.importe.valor
				}
			}
		}
	}
}