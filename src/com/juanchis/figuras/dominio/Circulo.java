package com.juanchis.figuras.dominio;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;

    }

    @Override
    public String toString() {
        return "Circulo";
    }

    @Override
    public double hallarArea() {
        return Math.pow(radio, 2) * (Math.PI);
    }

    @Override
    public double hallarPerimetro() {
        return 2 * Math.PI * radio;
    }


    public double getRadio() {return radio;}
}
