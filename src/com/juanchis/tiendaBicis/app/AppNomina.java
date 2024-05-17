package com.juanchis.tiendaBicis.app;

import com.juanchis.tiendaBicis.dominio.*;

import java.util.ArrayList;

public class AppNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina() {
        };

        nomina.calcularNomina();
        System.out.printf("\n");
        nomina.listarDirectos();
        System.out.printf("\n");
        nomina.listarFreelancers();
        System.out.printf("\n");
        nomina.listarPromotores();


    }
}



