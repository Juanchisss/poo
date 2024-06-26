package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIva extends Factura{
    public FacturaSinIva(long valor, String cliente, LocalDate fechaVencimiento, String medioPago) {
        super(cliente, valor, fechaVencimiento, medioPago);
    }

    @Override
    protected long calcularTotal() {
        System.out.println(valor);
        return valor;
    }

    @Override
    public String toString() {
        return "FacturaSinIva{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", medioPago='" + medioPago + '\'' +
                ", total=" + this.calcularTotal() +
                '}';
    }
}
