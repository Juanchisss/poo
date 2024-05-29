package com.juanchis.inmobiliaria.dominio;

public class InmuebleNoArrendableException extends Exception{
    InmuebleNoArrendableException(){
        super("El inmueble no es arrendable.");
    }
}
