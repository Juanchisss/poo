package com.juanchis.figuras.app;

import com.juanchis.figuras.dominio.*;
import com.juanchis.herencia.dominio.Cuadrilatero;
import com.juanchis.herencia.dominio.Rectangulo;

import java.util.ArrayList;
import java.util.List;

public class AppFiguras {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        Circulo bolita = new Circulo(4);
        Cuadrilatero cuadro = new Cuadrado(4, 4);
        Triangulo triangu = new trianEquilatero(2,2, 4);
        trianIsosceles iso = new trianIsosceles(2,2,2,2);
        Rectangulo iris = new Rectangulo(3, 1);


        figuras.add(bolita);
        figuras.add(triangu);
        figuras.add(cuadro);
        figuras.add(iris);

        System.out.printf("Veamos que figuras tienes... \n");
        for(FiguraGeometrica figura : figuras){
            System.out.println(figura);
        }

        System.out.printf("\n");

        System.out.printf("Vamos a calcular los valores de tus figuras... \n");
        for(FiguraGeometrica figura : figuras){
            System.out.printf("Soy un " + figura + "\n");
            figura.hallarValores(figura);
            System.out.printf("\n");
        }

    }


}
