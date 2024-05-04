package com.juanchis.figuras.dominio;

public abstract class FiguraGeometrica {

    public abstract double hallarArea();

    public abstract double hallarPerimetro();

    public static void hallarValores(FiguraGeometrica figura){
        System.out.printf("El area del " + figura + " es: ");
        System.out.println(figura.hallarArea());

        System.out.printf("El perimetro del " + figura + " es: ");
        System.out.println(figura.hallarPerimetro());

    }

}
