package com.juanchis.inmobiliaria.dominio;

public class Casa extends Inmueble implements Arrendable{

    public Casa(String direccion, long valorVenta, long valorArriendo) {
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
        return "Casa{" +
                "Direccion: '" + direccion + '\'' +
                ", Valor de venta: " + valorVenta +
                ", Valor de arriendo: " + valorArriendo +
                ", Arrendado: " + arrendado +
                '}';
    }
}
