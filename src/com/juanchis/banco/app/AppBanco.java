package com.juanchis.banco.app;

import com.juanchis.banco.dominio.CuentaBancaria;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria vanessaCuenta = new CuentaBancaria();

        miCuenta.consignar(10000000);
        miCuenta.retirar(950000);
        miCuenta.transferir(40000, vanessaCuenta);
        miCuenta.mostrarSaldo();
        System.out.println("Vanessa");
        vanessaCuenta.mostrarSaldo();
    }
}
