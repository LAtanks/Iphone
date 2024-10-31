package me.apple.iphone.apps;

import me.apple.iphone.apps.interfaces.IAparelhoTelefonico;

public class AparelhoTelefonico implements IAparelhoTelefonico {
    public String numero;
    public boolean ocupado;

    @Override
    public void ligar(String numero) {
        ocupado = true;
    }

    @Override
    public void atender() {
        if(ocupado == true){
            System.out.println("Telefone ocupado");
            return;
        }

        System.out.println("Atendo celular");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNumero() {
        return numero;
    }
}
