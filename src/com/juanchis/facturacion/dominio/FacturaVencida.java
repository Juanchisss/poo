package com.juanchis.facturacion.dominio;

import java.time.LocalDate;
import java.time.Period;

public class FacturaVencida extends Factura{
    public static int VLR_DIA_VENCIDO = 1000;

    public FacturaVencida(long valor, String cliente, LocalDate fechaVencimiento) {
        super(cliente, valor, fechaVencimiento);
    }

    @Override
    protected long calcularTotal() {
        return calcularVencimiento() + valor;
    }

    public int getDiasVencidos(){
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaVencimiento, fechaActual);
        return period.getDays();
    }


    public long calcularVencimiento(){
        return VLR_DIA_VENCIDO * getDiasVencidos();
    }

    @Override
    public String toString() {
        return "FacturaVencida{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", total..= " + calcularTotal() +
                '}';
    }
}
