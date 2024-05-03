package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public  abstract class Factura {
    protected long valor;
    protected String cliente;
    protected LocalDate fechaVencimiento;

    public Factura(String cliente,long valor,  LocalDate fechaVencimiento){
        this.valor = valor;
        this.cliente = cliente;
        this.fechaVencimiento = fechaVencimiento;
    }

    protected abstract long calcularTotal();

}
