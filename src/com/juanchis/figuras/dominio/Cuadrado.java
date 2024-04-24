package com.juanchis.figuras.dominio;

public class Cuadrado extends FigurasGeometricas{
    private double arista;

    public Cuadrado(double arista){
        this.arista = arista;
    }

    public void hallarAreaCuadrado(){
        double area = arista * 4;
        System.out.printf("El area del cuadrado cuya arista mide " + arista + " es igual a " + area + "\n");

    }

    public double getArista() {return arista;}
}
