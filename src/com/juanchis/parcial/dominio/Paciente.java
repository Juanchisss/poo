package com.juanchis.parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private long cedula;
    private String nombre;
    private List<Enfermedad> enfermedades = new ArrayList<>();

    public Paciente(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;

    }

    public String getNombre() {return nombre;}

    public long getCedula() {return cedula;}

    public List<Enfermedad> getEnfermedades() {return enfermedades;}

    public void setEnfermedades(List<Enfermedad> enfermedades) {this.enfermedades = enfermedades;}
}


