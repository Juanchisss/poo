package com.juanchis.tiendaBicis.dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre, int volantesRepartidos , long valorVolante, int comprasVolante ) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {
        return (volantesRepartidos * valorVolante) + (comprasVolante * 12_900L);
    }

    @Override
    public String toString() {
        return "Promotor/a{" +
                "Nombre: " + getNombre() +
                ", VolantesRepartidos: " + volantesRepartidos +
                ", ValorVolante: " + valorVolante +
                ", ComprasVolante: " + comprasVolante +
                ", Salario total: " + calcularSalario() +
                '}';
    }
}
