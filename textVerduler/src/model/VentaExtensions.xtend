package model

import textVerduler.textVerduler.Venta

class VentaExtensions {

	def static ganancias(Venta unaVenta) {
		if (unaVenta.importe.valor == unaVenta.total.importe.valor) {
			if (unaVenta.total.estado == "queda debiendo") {
				return 0
			} else {
				return unaVenta.importe.valor
			}
		} else {
			if (unaVenta.importe.valor < unaVenta.total.importe.valor) {
				return unaVenta.importe.valor - (unaVenta.total.importe.valor - unaVenta.importe.valor)
			} else {
				return unaVenta.importe.valor - unaVenta.total.importe.valor
			}
		}
	}

	def static estadoDeCompra(Venta unaVenta) {
		if (unaVenta.total.estado == "queda debiendo") {
			return ( - unaVenta.total.importe.valor)
		} else {
			if (unaVenta.importe.valor == unaVenta.total.importe.valor) {
				return 0
			} else {
				if (unaVenta.importe.valor < unaVenta.total.importe.valor) {
					return unaVenta.total.importe.valor - unaVenta.importe.valor
				} else {
					return unaVenta.importe.valor - unaVenta.total.importe.valor
				}
			}
		}
	}
}