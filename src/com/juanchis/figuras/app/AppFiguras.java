package com.juanchis.figuras.app;

import com.juanchis.figuras.dominio.Circulo;
import com.juanchis.figuras.dominio.Cuadrado;
import com.juanchis.figuras.dominio.Triangulo;

public class AppFiguras {
    public static void main(String[] args) {
        Circulo bolita = new Circulo(2);
        Cuadrado cuadro = new Cuadrado(4);
        Triangulo triangu = new Triangulo(2,2);

        bolita.hallarAreaCirculo();
        cuadro.hallarAreaCuadrado();
        triangu.hallarAreaTriangulo();
    }


}
