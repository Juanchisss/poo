package com.juanchis.juego.dominio;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private String piedra;
    private String papel;
    private String tijera;
    public static List<String> opciones = new ArrayList<>();

    public Juego() {
        opciones.add(piedra);
        opciones.add(papel);
        opciones.add(tijera);
    }

    public void mostrarOpciones() {
        System.out.println("Opciones disponibles:");
        for (String elemento : opciones) {
            System.out.println(elemento);
        }
    }
}