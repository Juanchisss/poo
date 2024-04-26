package com.juanchis.herencia.dominio;

public class Bicicleta extends Vehiculo{
    private int cadencia;

    public Bicicleta(String marca, String modelo) {super(marca, modelo);}

    @Override
    public void acelerar(double incremento) {
        System.out.println("Acelerando bici...");
        this.velocidad += incremento;
    }

    @Override
    public String toString() {
        return  "Bicicleta { " +
                "Serial: " + serial +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Cadencia: " + cadencia + "} ";
    }

    public int getCadencia() {return cadencia;}

    public void setCadencia(int cadencia) {this.cadencia = cadencia;}
}
