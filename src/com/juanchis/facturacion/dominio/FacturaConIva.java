package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIva extends Factura{
    private double porcIva;

    public FacturaConIva(long valor, String cliente, LocalDate fechaVencimiento, String medioPago, double porcIva) {
        super(cliente, valor, fechaVencimiento, medioPago);
        this.porcIva = porcIva;
    }

    public long calcularIva(){
       return (long) (porcIva * valor);
    }

    @Override
    protected long calcularTotal() {
        return valor + calcularIva();
    }

    @Override
    public String toString() {
        return "FacturaConIva{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ".,total de la factura=" + calcularTotal() +
                ", medioPago='" + medioPago + '\'' +
                '}';
    }
}
