package Iphone;

import FuncionalidadeTelefonico.SmartphoneMultifuncional.SmartphoneMultifuncional;

public class Smartphone {
    public static void main(String[] args) throws Exception {
       SmartphoneMultifuncional iphone = new SmartphoneMultifuncional();

       iphone.ligar("9387564736");
       iphone.atender();
       iphone.iniciarCorreioVoz();

       iphone.selecionarMusica("Música Relaxante para Dormir");
       iphone.play();
       iphone.pause();

       iphone.exibirPagina("www.emxaple.com.br");
       iphone.adicionarNovaAba();
       iphone.atualizarPagina();  
    }
}
