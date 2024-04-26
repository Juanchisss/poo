package com.juanchis.figuras.dominio;

public class Triangulo extends FiguraGeometrica {
    protected double base;
    protected double altura;
    protected double ladoA;
    protected double ladoB;

    public Triangulo(double base, double altura, double ladoA){
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
    }

    @Override
    public String toString() {
        return "Triangulo";
    }

    @Override
    public double hallarArea() {
        return ((base * altura) / 2);
    }

    @Override
    public double hallarPerimetro() {
        return (3 * ladoA);
    }

}
