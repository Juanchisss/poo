package com.juanchis.tiendaBicis.dominio;

public class Freelance extends Empleado{
    private long valorHora;
    private int horasTrabajadas;

    public Freelance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public String toString() {
        return "Freelance{" +
                "Nombre: " + getNombre() +
                ", ValorHora: " + valorHora +
                ", HorasTrabajadas: " + horasTrabajadas +
                ", Salario total: " + calcularSalario() +
                '}';
    }
}
