package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIva{
    private double porcDescuento;

    public FacturaConDescuento(long valor, String cliente, LocalDate fechaVencimiento,String medioPago, double porcDescuento) {
        super(valor, cliente, fechaVencimiento, medioPago);
        this.porcDescuento = porcDescuento;
    }

    @Override
    protected long calcularTotal() {
        return valor - calcularDescuento();
    }

    public long calcularDescuento(){
        double valorDescuento = (porcDescuento * valor);
        return (long) valorDescuento;
    }

    @Override
    public String toString() {
        return "FacturaConDescuento{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", descuento=" + porcDescuento +
                ", medioPago='" + medioPago + '\'' +
                ", total= " + calcularTotal() +
                '}';
    }
}
