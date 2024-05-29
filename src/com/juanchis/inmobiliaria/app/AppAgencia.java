package com.juanchis.inmobiliaria.app;

import com.juanchis.inmobiliaria.dominio.*;

public class AppAgencia {
    public static void main(String[] args) throws ArrendadoException, InmuebleNoArrendableException {
        Agencia agencia = new Agencia("Bienes raicez");

        Apartamento apt = new Apartamento("Calle 1", 200_000_000, 1_500_000);
        Casa casa = new Casa("Calle 2", 300_000_000, 2_000_000);
        Lote lote = new Lote("Calle 3", 90_000_000);

        agencia.agregarInmueble(apt);
        agencia.agregarInmueble(casa);
        agencia.agregarInmueble(lote);

        agencia.arrendar(apt);
        agencia.arrendar(casa);
        agencia.arrendar(apt);
        agencia.arrendar(lote);
//        agencia.vender(casa);
//        agencia.devolver(casa);


        System.out.printf("Los inmuebles arrendados son los siguietes: \n");
        agencia.getArrendados();


        System.out.printf("Los inmuebles disponibles son los siguietes: \n");
        agencia.getArrendablesDisponibles();
    }
}
