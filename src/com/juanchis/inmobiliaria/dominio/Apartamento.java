package com.juanchis.inmobiliaria.dominio;

import java.security.PublicKey;

public class Apartamento extends Inmueble implements Arrendable{

    public Apartamento(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }

    @Override
    public void arrendar() {
        this.arrendado = true;
    }

    @Override
    public void devolver() {
        this.arrendado = false;
    }

    @Override
    public String toString() {
        return "Apartamento: " +
                "Direccion: " + direccion + '\'' +
                ", Valor de venta: " + valorVenta +
                ", Valor de arriendo: " + valorArriendo +
                ", Arrendado: " + arrendado +
                '}';
    }
}
