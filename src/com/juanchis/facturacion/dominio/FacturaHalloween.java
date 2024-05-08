package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaHalloween extends Factura{
    double diaMaldito = 0.666;

    public FacturaHalloween(String cliente, long valor, LocalDate fechaVencimiento, String medioPago, double diaMaldito) {
        super(cliente, valor, fechaVencimiento, medioPago);
        this.diaMaldito = diaMaldito;
    }

    @Override
    protected long calcularTotal() {
        return (long) (valor + (valor * diaMaldito));
    }

    @Override
    public String toString() {
        return "FacturaHalloween{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", medioPago='" + medioPago + '\'' +
                ", total=" + calcularTotal() +
                '}';
    }
}
