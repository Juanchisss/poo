package com.juanchis.herencia.dominio;

public class Rectangulo extends Cuadrilatero{
    public Rectangulo(double ladoA, double ladoB) {super(ladoA, ladoB);
    }

    @Override
    public String toString() {
        return "Rectangulo";
    }

    @Override
    public double hallarArea() {
        return super.hallarArea();
    }

    @Override
    public double hallarPerimetro() {
        return ladoA + ladoB + ladoA + ladoB;
    }
}