package com.juanchis.persona.dominio;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private List<String> asignaturas;

    public Profesor(String nombre, List<String> asignaturas){
        this.setNombre(nombre);
        this.setAsignaturas(asignaturas);

    }

    public static void ensenar(List<Profesor> profesores) {
        for (Profesor profesor : profesores) {
            if (profesor instanceof Profesor) {
                System.out.printf("Me llamo "+ profesor.getNombre() + " y soy un profesor que está enseñando las siguientes asignaturas: "
                        + profesor.getAsignaturas());
            }
        }
    }

    public List<String> getAsignaturas() {return asignaturas;}

    public void setAsignaturas(List<String> asignaturas) {this.asignaturas = asignaturas;}
}
