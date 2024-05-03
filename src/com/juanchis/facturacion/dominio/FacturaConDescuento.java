package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIva{
    private double porcDescuento;

    public FacturaConDescuento(long valor, String cliente, LocalDate fechaVencimiento,double porcDescuento) {
        super(valor, cliente, fechaVencimiento);
        this.porcDescuento = porcDescuento;
    }

    public long calcularDescuento(){
        double valorDescuento = (porcDescuento * valor);
        return (long) (valor - valorDescuento);
    }
}
