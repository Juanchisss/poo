package com.juanchis.facturacion.app;

import com.juanchis.facturacion.dominio.Factura;
import com.juanchis.facturacion.dominio.FacturaConIva;
import com.juanchis.facturacion.dominio.FacturaSinIva;
import com.juanchis.facturacion.dominio.Facturacion;

import java.time.LocalDate;
import java.util.List;

public class AppFactu {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Alfredo", 950000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Alejandro", 3_160_000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Juanchisss", 5_000_000, LocalDate.of(2024, 4, 20));
        facturacion.generarFactura("Pedro", 10_000_000, LocalDate.now());

        long total = facturacion.getTotalFacturacion();
        System.out.println("El total de la facturacion fue: " + total);

        Factura masCara = facturacion.getFacturaMasCara();
        System.out.println("La factura mas cara es: " + masCara);

        List<Factura> sinIva = facturacion.getFacturasSinIva();
        System.out.println(sinIva);
    }
}
