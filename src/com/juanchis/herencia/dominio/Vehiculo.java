package com.juanchis.herencia.dominio;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public void acelerar(double incremento) {
        System.out.println("Acelerando vehiculo...");

        if (incremento > 0) {
            this.velocidad += incremento;
        }
    }

    public void frenar (double decremento){
        System.out.println("Acelerando vehiculo...");


        if (decremento > 0){
            this.velocidad -=decremento;
        }
    }

    public double getVelocidad() {return velocidad;}

    public String getMatricula() {return matricula;}

    public String getMarca() {return marca;}

    public String getModelo() {return modelo;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

}


