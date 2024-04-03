package com.juanchis.taller.punto2.app;

import com.juanchis.taller.punto2.dominio.MaquinaDispensadora;
import com.juanchis.taller.punto2.dominio.Snack;

import java.util.Scanner;


public class AppMaquinaDispensadora {
    public static void main(String[] args) {
        MaquinaDispensadora maquinaDispensadora = new MaquinaDispensadora();
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de inicialización con algunos productos predefinidos
        maquinaDispensadora.agregarSnack(new Snack("Producto inicial", "000", 5)); // Ejemplo inicial

        while (true) {
            System.out.println("\nBienvenido a la máquina dispensadora.");
            maquinaDispensadora.mostrarSnacks(); // Mostrar productos disponibles cada vez
            System.out.print("Introduce el código del producto a dispensar, '222' para administración, o 'salir' para terminar: ");
            String codigo = scanner.nextLine();

            if (codigo.equalsIgnoreCase("salir")) {
                break;
            } else if (codigo.equals("222")) {
                System.out.println("Modo administrador activado.");
                System.out.println("Opciones: 1. Agregar Producto 2. Quitar Snack 3. Sacar Snack");
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1: // Agregar producto
                        System.out.print("Introduce el nombre del nuevo producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Introduce el código del nuevo producto: ");
                        String codSnack = scanner.nextLine();
                        System.out.print("Introduce la cantidad inicial del producto: ");
                        int cantidad = Integer.parseInt(scanner.nextLine());
                        maquinaDispensadora.agregarSnack(new Snack(nombre, codSnack, cantidad));
                        break;

                    case 2: // Quitar Snack Maquina
                        System.out.print("Introduce el código del snack a quitar: ");
                        String codEliminar = scanner.nextLine();
                        maquinaDispensadora.eliminarSnack(codEliminar);
                        break;

                    case 3: //sacar snack por nombre
                        System.out.print("Introduce el nombre del snack a sacar: ");
                        String codSacar = scanner.nextLine();
                        maquinaDispensadora.sacarSnackPorNombre(codSacar);
                        break;

                    case 4: /// mostrar snacks de la maquina
                        System.out.println("Los snacks que hay actualmente son: \n");
                        maquinaDispensadora.mostrarSnacks();
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } else {
                maquinaDispensadora.sacarProductoPorCodigo(codigo);
            }
        }

        scanner.close();
        System.out.println("Gracias por usar la máquina dispensadora.");
    }
}


