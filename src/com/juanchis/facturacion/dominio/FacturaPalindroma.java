package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaPalindroma extends Factura{
    double descuento = 0.5;
    public FacturaPalindroma(String cliente, long valor, LocalDate fechaVencimiento, String medioPago, double descuento) {
        super(cliente, valor, fechaVencimiento, medioPago);
        this.descuento = descuento;
    }



    @Override
    protected long calcularTotal() {
        return (long) (valor - (valor * descuento));
    }

    @Override
    public String toString() {
        return "FacturaPalindroma{" +
                "descuento=" + descuento +
                ", valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", medioPago='" + medioPago + '\'' +
                ", total= " + calcularTotal() +
                '}';
    }
}
