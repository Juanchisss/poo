package com.juanchis.facturacion.app;

import com.juanchis.facturacion.dominio.FacturaConIva;
import com.juanchis.facturacion.dominio.FacturaSinIva;
import com.juanchis.facturacion.dominio.Facturacion;

import java.time.LocalDate;

public class AppFactu {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Alfredo", 950000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Alejandro", 3_160_000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Juanchisss", 5_000_000, LocalDate.of(2024, 4, 20));


        facturacion.getTotalFacturacion();
        facturacion.getFacturaMasCara();
        facturacion.getFacturasSinIva();
    }
}
