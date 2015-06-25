package model

import textVerduler.textVerduler.Venta

class VentaExtensions {

	def static ganancias(Venta unaVenta) {
		if (unaVenta.unImporte.valor == unaVenta.unTotal.unImporte.valor) {
			if (unaVenta.unTotal.unTotal == "queda debiendo") {
				return 0
			} else {
				return unaVenta.unImporte.valor
			}
		} else {
			if (unaVenta.unImporte.valor < unaVenta.unTotal.unImporte.valor) {
				return unaVenta.unImporte.valor - (unaVenta.unTotal.unImporte.valor - unaVenta.unImporte.valor)
			} else {
				return unaVenta.unImporte.valor - unaVenta.unTotal.unImporte.valor
			}
		}
	}

	def static estadoDeCompra(Venta unaVenta) {
		if (unaVenta.unTotal.unTotal == "queda debiendo") {
			return ( - unaVenta.unTotal.unImporte.valor)
		} else {
			if (unaVenta.unImporte.valor == unaVenta.unTotal.unImporte.valor) {
				return 0
			} else {
				if (unaVenta.unImporte.valor < unaVenta.unTotal.unImporte.valor) {
					return unaVenta.unTotal.unImporte.valor - unaVenta.unImporte.valor
				} else {
					return unaVenta.unImporte.valor - unaVenta.unTotal.unImporte.valor
				}
			}
		}
	}
}