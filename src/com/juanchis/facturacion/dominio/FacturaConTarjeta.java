package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConTarjeta extends Factura{
    double comision = 0.1;
    public FacturaConTarjeta(String cliente, long valor, LocalDate fechaVencimiento, String medioPago, double comision) {
        super(cliente, valor, fechaVencimiento, medioPago);
        this.comision = comision;
    }

    public double calcularComision (){
        return valor * comision;
    }

    @Override
    protected long calcularTotal() {
        return (long) (valor + calcularComision());
    }

    @Override
    public String toString() {
        return "FacturaConTarjeta{" +
                "comision por pago con tarjeta=" + comision +
                ", valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", medioPago='" + medioPago + '\'' +
                ", total=" + calcularTotal() +
                '}';
    }
}
