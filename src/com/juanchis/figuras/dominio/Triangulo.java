package com.juanchis.figuras.dominio;

public class Triangulo extends FigurasGeometricas {
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    public void hallarAreaTriangulo(){
        double area = ( base * altura ) / 2;
        System.out.printf("El area de su triangulo cuya base es " + base + " y cuya altura es " + altura
        + " es igual a " + area + "\n");
    }
}
