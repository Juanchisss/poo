package com.juanchis.figuras.dominio;

public class Circulo extends FigurasGeometricas{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;

    }

    public void  hallarAreaCirculo() {
        double resultado = Math.pow(radio, 2) * (Math.PI);
        System.out.printf("el area del circulo cuyo radio es " + getRadio() + " es igual a " + resultado + "\n");
    }

    public double getRadio() {return radio;}
}
