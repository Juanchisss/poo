package com.juanchis.figuras.dominio;

public class TrianguloIsosceles extends Triangulo{
    public TrianguloIsosceles(double base, double altura, double ladoA, double ladoB) {super(base, altura, ladoA);}

    @Override
    public String toString() {
        return "Triangulo Isosceles";
    }

    @Override
    public double hallarPerimetro() {
        return (base + ladoA + ladoB);
    }
}

