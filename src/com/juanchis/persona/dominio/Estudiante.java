package com.juanchis.persona.dominio;

import java.util.List;

public class Estudiante extends Persona{
    public Estudiante (String nombre){
        this.setNombre(nombre);
    }

    public static void estudiar(List<Estudiante> estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante instanceof Estudiante) {
                System.out.printf("Me llamo "+ estudiante.getNombre() + " y soy un estudiante que está aprendiendo... \n");
            }
        }
    }

}
