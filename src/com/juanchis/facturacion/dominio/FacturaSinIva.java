package com.juanchis.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIva extends Factura{
    public FacturaSinIva(long valor, String cliente, LocalDate fechaVencimiento) {
        super(cliente, valor, fechaVencimiento);
    }

    @Override
    protected long calcularTotal() {
        return valor;
    }
}
