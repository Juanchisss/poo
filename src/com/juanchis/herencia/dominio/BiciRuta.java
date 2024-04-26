package com.juanchis.herencia.dominio;

public class BiciRuta extends Bicicleta{
    public BiciRuta(String marca, String modelo) {super(marca, modelo);}

    @Override
    public String toString() {return super.toString() + " Soy una bici de ruta que ";}
}
