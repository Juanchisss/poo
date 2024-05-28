package com.juanchis.inmobiliaria.dominio;

public abstract class Inmueble {
    protected String direccion;
    protected long valorVenta;
    protected long valorArriendo;
    protected boolean arrendado;

    public Inmueble(String direccion, long valorVenta, long valorArriendo) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
        this.arrendado = false;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "direccion='" + direccion + '\'' +
                ", valorVenta=" + valorVenta +
                ", valorArriendo=" + valorArriendo +
                ", arrendado=" + arrendado +
                '}';
    }
}