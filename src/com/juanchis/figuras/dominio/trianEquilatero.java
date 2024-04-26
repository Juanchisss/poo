package com.juanchis.figuras.dominio;

public class trianEquilatero extends Triangulo{
    public trianEquilatero(double base, double altura, double ladoA) {super(base, altura, ladoA);}

    @Override
    public String toString() {
        return "Triangulo Equilatero";
    }

}
