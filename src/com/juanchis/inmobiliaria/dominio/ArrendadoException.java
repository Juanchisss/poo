package com.juanchis.inmobiliaria.dominio;

public class ArrendadoException extends Exception{
    ArrendadoException() {
        super("El inmuble ya esta arrendado");
    }
}
