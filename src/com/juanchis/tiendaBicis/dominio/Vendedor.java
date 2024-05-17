package com.juanchis.tiendaBicis.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        long comision = 0;
        if (salario < 1_500_000 ){
             comision = (long) (ventasDelMes * 0.045);
        } else {
             comision = (long) (ventasDelMes * 0.035);
        }
        return comision;
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + calcularComision();
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Nombre: " + getNombre() +
                ", Salario base: " + salario +
                ", VentasDelMes: " + ventasDelMes +
                ", Salario total: " + calcularSalario() +
                '}';
    }
}
