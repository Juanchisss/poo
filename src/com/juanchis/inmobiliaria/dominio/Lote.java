package com.juanchis.inmobiliaria.dominio;

public class Lote extends Inmueble {

    public Lote(String direccion, long valorVenta) {
        super(direccion, valorVenta);
    }

    @Override
    public String toString() {
        return "Lote{" +
                "Direccion: " + direccion + '\'' +
                ", Valor de venta=" + valorVenta +
                '}';
    }
}
