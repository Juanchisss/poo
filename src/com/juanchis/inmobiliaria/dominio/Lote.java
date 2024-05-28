package com.juanchis.inmobiliaria.dominio;

public class Lote extends Inmueble {

    public Lote(String direccion, long valorVenta, long valorArriendo) {
        super(direccion, valorVenta, valorArriendo);
    }

    @Override
    public String toString() {
        return "Lote{" +
                "Direccion: " + direccion + '\'' +
                ", Valor de venta=" + valorVenta +
                '}';
    }
}
