package com.juanchis.herencia.dominio;

public class BiciMontana extends Bicicleta{
    private String tipoSuspension;

    public BiciMontana(String marca, String modelo) {super(marca, modelo);}

    @Override
    public String toString() {
        return super.toString() +
                "Soy una bici de montaña";
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }
}
