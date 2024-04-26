package com.juanchis.herencia.dominio;

import com.juanchis.figuras.dominio.FiguraGeometrica;

public class Cuadrilatero extends FiguraGeometrica {
    protected double ladoA;
    protected double ladoB;

    public Cuadrilatero(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "Cuadrilatero";
    }

    @Override
    public double hallarArea() {
        return ladoA * ladoB;
    }

    @Override
    public double hallarPerimetro() {
        return (2 * ladoA) + (2 * ladoA) ;
    }

    public double getLadoA() {return ladoA;}

    public double getLadoB() {return ladoB;}
}

