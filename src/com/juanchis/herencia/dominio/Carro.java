package com.juanchis.herencia.dominio;

public class Carro extends Vehiculo{
    protected String placa;

    public Carro(String marca, String modelo) { super(marca, modelo); }

    public Carro(String marca, String modelo, String color){super(marca, modelo, color);}

    @Override
    public String toString() {
        return "Carro {" +
                " Placa: "  + placa +
                ", Marca: " + marca +
                ", Modelo: " + modelo + "} "
                ;
    }

    public String getPlaca() {return placa;}

    public void setPlaca(String placa) {this.placa = placa;}
}
