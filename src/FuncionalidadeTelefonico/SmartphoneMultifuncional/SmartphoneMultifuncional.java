package FuncionalidadeTelefonico.SmartphoneMultifuncional;

import FuncionalidadeTelefonico.AparelhoTelefonico.AparelhoTelefonico;
import FuncionalidadeTelefonico.NavegadorInternet.AcessoNavegador;
import FuncionalidadeTelefonico.ReprodutorMusical.MusicPlayer;

public class SmartphoneMultifuncional implements AparelhoTelefonico, AcessoNavegador, MusicPlayer {
   
    public void play() {
        System.out.println("MÚSICA TOCANDO.......");
    }

    public void pause() {
        System.out.println("A MÚSICA FOI PAUSADA......");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A MÚSICA FOI SELECIONADA.......");
    }
    public void ligar(String numero) {
        System.out.println("LIGANDO......");
    }

    public void atender() {
        System.out.println("O NÚMERO ATENDEU......");
    }

    public void iniciarCorreioVoz() {
        System.out.println("VOCÊ ACESSOU O CORREIO DE VOZ.......");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página......");
    }

    public void adicionarNovaAba() {
        System.out.println("Aba adicionada........");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.........");
    }
}
