package com.juanchis.persona.dominio;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;

    Random rndm = new Random();

    public void caminar(){
        System.out.printf(this.nombre + " avanzó " + rndm.nextInt(10) + " pasos\n" );
    }


    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}

    public double getEstatura() {return estatura;}


}
