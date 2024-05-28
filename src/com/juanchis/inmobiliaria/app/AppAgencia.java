package com.juanchis.inmobiliaria.app;

import com.juanchis.inmobiliaria.dominio.*;

public class AppAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Bienes raicez");

        Apartamento apt = new Apartamento("Calle 1", 200_000_000, 1_500_000);
        Inmueble casa = new Casa("CALLE 2", 300_000_000, 2_000_000);
        Inmueble lote = new Lote("Calle 3", 90_000_000, 0);

        agencia.agregarInmueble(apt);
        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(lote);
        agencia.arrendar((Arrendable) apt);

        System.out.printf("Los inmuebles arrendados son los siguietes: \n");
        agencia.getArrendados();


        System.out.printf("Los inmuebles disponibles son los siguietes: \n");
        agencia.getArrendablesDisponibles();
    }
}
