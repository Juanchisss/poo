package com.juanchis.figuras.dominio;

public class trianIsosceles extends Triangulo{
    public trianIsosceles(double base, double altura, double ladoA, double ladoB) {super(base, altura, ladoA);}

    @Override
    public String toString() {
        return "Triangulo Isosceles";
    }

    @Override
    public double hallarPerimetro() {
        return (base + ladoA + ladoB);
    }
}

