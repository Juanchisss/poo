package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public  abstract class Factura {
    protected long valor;
    protected String cliente;
    protected LocalDate fechaVencimiento;
    protected String medioPago;

    public Factura(String cliente,long valor,  LocalDate fechaVencimiento, String medioPago){
        this.valor = valor;
        this.cliente = cliente;
        this.fechaVencimiento = fechaVencimiento;
        this.medioPago = medioPago;
    }

    protected abstract long calcularTotal();

}
