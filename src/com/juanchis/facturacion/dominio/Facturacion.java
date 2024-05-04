package com.juanchis.facturacion.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion(){
        this.facturas = new ArrayList<>();
    }


    public void generarFactura(String cliente, long valor, LocalDate fecha) {
        Factura factura = null;

        if (fecha.isBefore(LocalDate.now())) {
            factura = new FacturaVencida(valor, cliente, fecha);
        } else if (valor < 1_000_000){
            factura = new FacturaSinIva(valor, cliente, fecha);
        } else if (valor < 5_000_000) {
            factura = new FacturaConIva(valor, cliente, fecha, 0.19);
        }else {
            factura = new FacturaConDescuento(valor,cliente,fecha, 0.10);
        }

        this.facturas.add(factura);
    }

    public long getTotalFacturacion(){
        long totalFacturacion = 0;
        for(Factura factura : facturas){
            totalFacturacion += factura.calcularTotal();
        }
        return totalFacturacion;
    }

    public Factura getFacturaMasCara() {
        if (facturas.isEmpty()){
            System.out.printf("No hay facturas en la lista...");
        }

        Factura facturaMasCara = facturas.get(0);

        for (Factura factura : facturas)
            if(factura.calcularTotal() > facturaMasCara.calcularTotal()){
                facturaMasCara = factura;
            }

        return facturaMasCara;
    }

    public List<Factura> getFacturasSinIva() {
        List<Factura> facturasSinIva = new ArrayList<>();

        for(Factura facturaSin : facturas){
            if(facturaSin instanceof FacturaSinIva){
                facturasSinIva.add(facturaSin);
            }
        }
        return facturasSinIva;
    }
}
