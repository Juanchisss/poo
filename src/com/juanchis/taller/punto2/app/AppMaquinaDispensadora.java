package com.juanchis.taller.punto2.app;

import com.juanchis.taller.punto2.dominio.MaquinaDispensadora;
import com.juanchis.taller.punto2.dominio.Snack;

import java.sql.SQLOutput;
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
                System.out.println("Opciones: 1. Agregar Producto 2. Sacar un Snack por codigo 3. Sacar un Snack por nombre ");
                System.out.println("4. Aumentar unidad Snack por cod o Nombre  5. Quitar Snack  6. Obtener cantidad de Snack ");
                System.out.println("7. Obtener Snacks Agotados  8. Mostrar todos los snacks y cantidad ");
                System.out.println("9. Snacks ordenados de mayor a menor. 10. Snacks ordenados de menor a mayor");

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

                    case 2: // Sacar snack por codigo
                        System.out.printf("Introduce el codigo del snack a sacar: ");
                        String codSacar = scanner.nextLine();
                        maquinaDispensadora.sacarSnackPorCodigo(codSacar);
                        break;

                    case 3: //sacar snack por nombre
                        System.out.print("Introduce el nombre del snack a sacar: ");
                        String codReti = scanner.nextLine();
                        maquinaDispensadora.sacarSnackPorNombre(codReti);
                        break;

                    case 4:// aumentar snack por cod o nombre
                        System.out.println("Escribe el codigo del snack: ");
                        String codProd = scanner.nextLine();
                        System.out.printf("Escribe la cantidad a aumentar");
                        int cantProd = Integer.parseInt(scanner.nextLine());
                        maquinaDispensadora.aumentarSnack(codProd, cantProd);
                        break;


                    case 5: /// Quitar Snack Maquina
                        System.out.print("Introduce el código del snack a quitar: ");
                        String codEliminar = scanner.nextLine();
                        maquinaDispensadora.eliminarSnack(codEliminar);
                        break;

                    case 6: // Snacks totales
                        System.out.printf("Quedan los siguientes Snacks en la maquina: \n");
                        maquinaDispensadora.mostrarSnacks();
                        break;


                    case 7: //Snacks agotados
                        System.out.printf("Los Snacks agotados son los siguientes: \n");
                        maquinaDispensadora.mostrarSnacksAgotados();
                        break;


                    case 8: ///// mostrar snacks de la maquina
                        System.out.println("Los snacks que hay actualmente son: \n");
                        maquinaDispensadora.mostrarSnacks();
                        break;

                    case 9: //Snacks ordenados de mayor a menor

                    case 10: //Snacks ordenados de menor a mayor
                        System.out.println("los snacks ordenados de manera descendente son: ");


                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }

        scanner.close();
        System.out.println("Gracias por usar la máquina dispensadora.");
    }
}


