package me.apple.iphone.apps;

import me.apple.iphone.apps.interfaces.INavegadorInternet;

public class NavegadorInternet implements INavegadorInternet {
    private String urlSelecionada = "";

    @Override
    public void exibirPagina(String url) {
        urlSelecionada = url;
        atualizarPagina();
        System.out.println("Mostrando a pagina: " + urlSelecionada);
    }

    @Override
    public void adicionarNovaAba() {
        atualizarPagina();
        System.out.println("Adicionando nova aba com na aba google");
    }


    private void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
