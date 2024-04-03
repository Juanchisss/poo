package com.juanchis.taller.punto2.dominio;
import com.juanchis.taller.punto2.dominio.Snack;
import java.util.ArrayList;


public class MaquinaDispensadora {
    private ArrayList<Snack> snacks = new ArrayList<>();
    private static final int MAX_PRODUCTOS = 12; // Máximo de productos diferentes

    public MaquinaDispensadora() {

    }

//1METODO PARA AGREGAR SNACK
    public void agregarSnack(Snack snack) {
        if (snacks.size() < MAX_PRODUCTOS && !productoYaExiste(snack.getCodigo())) {
            snacks.add(snack);
            System.out.println("Producto agregado: " + snack.getNombre());
        } else {
            System.out.println("No se pueden agregar más productos o el producto ya existe.");
        }
    }

    private boolean productoYaExiste(String codigo) {
        for (Snack producto : snacks) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

///2METODO PARA SACAR UN SNACK POR CODIGO
    public void sacarProductoPorCodigo(String codigo) {
        for (Snack snack : snacks) {
            if (snack.getCodigo().equalsIgnoreCase(codigo)) {
                if (snack.getCantidad() > 0) {
                    snack.setCantidad(snack.getCantidad() - 1); // Reducir la cantidad
                    System.out.println("Producto dispensado: " + snack.getNombre() + ". Cantidad restante: " + snack.getCantidad());
                } else {
                    System.out.println("El producto está agotado.");
                }
                return;
            }
        }
        System.out.println("Código no encontrado.");
    }

///3METODO PARA SACAR UN SNACK POR NOMBRE
    public void sacarSnackPorNombre(String nombre){
        for(Snack snack:snacks){
            if (snack.getNombre().equalsIgnoreCase(nombre)){
                if (snack.getCantidad()>0){
                    snack.setCantidad(snack.getCantidad()-1);
                    System.out.println("Producto dispensado: " + snack.getNombre() + "Cntidad restante: " + snack.getCantidad());
                } else{
                    System.out.println("El producto está agotado");
                }
            }
        }
        return;
    }

//4AUMENTAR CANTIDAD DE SNACKS POR CODIGO (FALTA POR NOMBRE)
    public void reabastecerProducto(String codigo, int cantidad) {
        for (Snack snack : snacks) {
            if (snack.getCodigo().equalsIgnoreCase(codigo)) {
                int nuevaCantidad = Math.min(snack.getCantidad() + cantidad, Snack.MAX_CANTIDAD);
                snack.setCantidad(nuevaCantidad);
                System.out.println("Producto reabastecido: " + snack.getNombre() + ". Cantidad actual: " + snack.getCantidad());
                return;
            }
        }
        System.out.println("Código no encontrado para reabastecimiento.");
    }


 ///   public void editarProducto(String codigo, String nuevoNombre, int nuevaCantidad) {
 ///       for (Snack snack : snacks) {
 ///           if (snack.getCodigo().equalsIgnoreCase(codigo)) {
 ///               snack.setNombre(nuevoNombre);
 ///               snack.setCantidad(Math.min(nuevaCantidad, Snack.MAX_CANTIDAD));
 ///               System.out.println("Producto editado: " + snack);
 ///               return;
 ///           }
 ///       }
 ///       System.out.println("Código no encontrado.");
 ///   }

///5METODO PARA QUITAR UN SNACK DE LA MAQUINA DISPENSADORA
    public void eliminarSnack(String codigo) {
        snacks.removeIf(snack -> snack.getCodigo().equalsIgnoreCase(codigo));
        System.out.println("Snack eliminado si existía.");
    }

///6

///7MOSTRAR PRODUCTOS AGOTADOS
        public int mostrarSnacksAgotados () {
            return snacks.size();
        }


///8MOSTRAR SNACKS QUE QUEDAN EN GENERAL
        public void mostrarSnacks() {
            if (snacks.isEmpty()) {
                System.out.println("No hay productos en la máquina.");
            } else {
                for (Snack snack : snacks) {
                    System.out.println(snack);
                }
            }
        }

///9Ordenados de mayor a menor
        public void ordenadosMenorAMayor(){};
    }

    ///10 ordenados de mayor a menor
