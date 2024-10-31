package me.apple.iphone;

import me.apple.iphone.apps.AparelhoTelefonico;
import me.apple.iphone.apps.NavegadorInternet;
import me.apple.iphone.apps.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        ReprodutorMusical rm = new ReprodutorMusical();

        rm.selecionarMusica("Michael Jackson smooth criminal");
        rm.tocar();
        rm.pausar();

        AparelhoTelefonico at = new AparelhoTelefonico();
        at.atender();
        at.iniciarCorreioVoz();
        at.ligar("31312030203");

        NavegadorInternet ni = new NavegadorInternet();
        ni.adicionarNovaAba();
        ni.exibirPagina("steam.com");
    }
}
