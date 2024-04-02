package com.juanchis.taller.punto2.dominio;

public class Snack {
    private String marca;
    private int posicion;


    public Snack(String marca, int posicion, int cantidad){
        this.marca = marca;
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getMarca() {
        return marca;
    }
}