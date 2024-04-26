package com.juanchis.herencia.dominio;

public class Vehiculo {
    protected String serial;
    protected String marca;
    protected String modelo;
    protected String color;
    protected double velocidad;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

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

    @Override
    public String toString() {
        return "Vehiculo{ " +
                "Serial: " + serial +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Velocidad: " + velocidad + "} " ;
    }

    public double getVelocidad() {return velocidad;}

    public String getMatricula() {return serial;}

    public String getMarca() {return marca;}

    public String getModelo() {return modelo;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

}


