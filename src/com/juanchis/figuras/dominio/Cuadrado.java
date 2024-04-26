package com.juanchis.figuras.dominio;

import com.juanchis.herencia.dominio.Cuadrilatero;

public class Cuadrado extends Cuadrilatero {

    public Cuadrado(double ladoA, double ladoB) {super(ladoA, ladoB);}

    @Override
    public String toString() {
        return "Cuadrado";
    }



}
