package com.juanchis.banco.dominio;

public class CuentaBancaria {
    // Atributos
    public String numero;
    public Persona propietario;
    public double saldo;
    public double tasaInteres;
    public String tipo;
    public Banco banco;

    // Métodos
    public void consignar(int valorAConsignar) {
        this.saldo = this.saldo + valorAConsignar;
    }

    public boolean retirar(int valorARetirar) {
        if (valorARetirar <= this.saldo) {
            this.saldo -= valorARetirar;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(int valorATrans, CuentaBancaria otraCuenta) {
        boolean retiroCorrectamente = this.retirar(valorATrans);

        if (retiroCorrectamente) {
            otraCuenta.consignar(valorATrans);
            return true;
        } else {
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("El saldo es $" + this.saldo);
    }
}
