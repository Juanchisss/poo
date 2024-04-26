package com.juanchis.herencia.dominio;

public class Taxi extends Carro{
    private String empresa;
    private int nroPasajeros;

    public Taxi(String marca, String modelo, String color) {
        super(marca, modelo, "Amarillo");
    }

    @Override
    public String toString() {
        return "Taxi { " +
                "Placa: " + placa +
                ", NroPasajeros: " + nroPasajeros +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Empresa: " + empresa + "} ";
    }

    public void subirPasajero(){this.nroPasajeros ++; }
    public void bajarPasajero(){this.nroPasajeros --; }

    public String getEmpresa() {return empresa;}

    public void setEmpresa(String empresa) {this.empresa = empresa;}

    public int getNroPasajeros() {return nroPasajeros;}


}
