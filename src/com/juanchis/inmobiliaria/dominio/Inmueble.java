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

    public Inmueble(String direccion, long valorVenta) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(long valorVenta) {
        this.valorVenta = valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(long valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}