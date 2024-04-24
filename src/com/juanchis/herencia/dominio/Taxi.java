package com.juanchis.herencia.dominio;

public class Taxi extends Carro{
    private String empresa;
    private int nroPasajeros;

    public void subirPasajero(){this.nroPasajeros ++; }
    public void bajarPasajero(){this.nroPasajeros --; }

    public String getEmpresa() {return empresa;}

    public void setEmpresa(String empresa) {this.empresa = empresa;}

    public int getNroPasajeros() {return nroPasajeros;}


}
