package com.juanchis.figuras.dominio;

public class TrianguloEquilatero extends Triangulo{
    public TrianguloEquilatero(double base, double altura, double ladoA) {
        super(base, altura, ladoA);

    }

    @Override
    public String toString() {
        return "Triangulo Equilatero";
    }

}
