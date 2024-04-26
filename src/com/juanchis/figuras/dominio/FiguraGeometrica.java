package com.juanchis.figuras.dominio;

public class FiguraGeometrica {

    public double hallarArea(){return 0;}

    public double hallarPerimetro(){return 0;}

    public static void hallarValores(FiguraGeometrica figura){
        System.out.printf("El area del " + figura + " es: ");
        System.out.println(figura.hallarArea());

        System.out.printf("El perimetro del " + figura + " es: ");
        System.out.println(figura.hallarPerimetro());

    }

}
