package com.juanchis.taller.punto2.dominio;

public class Snack {
    private String nombre;
    private String codigo;
    private int cantidad;
    public static final int MAX_CANTIDAD = 6;

    public Snack(String nombre, String codigo, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = Math.min(cantidad, MAX_CANTIDAD);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = Math.min(cantidad, MAX_CANTIDAD); // Asegura que la cantidad no exceda el máximo
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return nombre + " (Código: " + codigo + ") - Cantidad: " + cantidad;
    }
}
