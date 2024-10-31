package me.apple.iphone.apps;

import me.apple.iphone.apps.interfaces.IReprodutorMusical;

public class ReprodutorMusical implements IReprodutorMusical {

    private boolean estaTocando = true;
    private String musicaSelecionada = "";

    @Override
    public void tocar() {
        if(musicaSelecionada.isEmpty()){
            System.out.println("Precisa selecionar a musica");
            return;
        }

        this.estaTocando = true;
        System.out.println("Está tocando musica: " + musicaSelecionada);
    }

    @Override
    public void pausar() {
        if(estaTocando == true){
            this.estaTocando = false;
        }else{
            System.out.println("A musica ja está pausada");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        pausar();
        this.musicaSelecionada = musica;
        System.out.println("Musica selecionada: " + musica);
    }

    public String getMusicaSelecionada() {
        return musicaSelecionada;
    }

    public void setEstaTocando(boolean estaTocando) {
        this.estaTocando = estaTocando;
    }

    public void setMusicaSelecionada(String musicaSelecionada) {
        this.musicaSelecionada = musicaSelecionada;
    }

    public boolean EstaTocando() {
        return estaTocando;
    }
}
