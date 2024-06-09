package FuncionalidadeTelefonico.AparelhoTelefonico;

public class Funcoes implements AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("LIGANDO......");
    }

    public void atender() {
        System.out.println("O NÚMERO ATENDEU......");
    }

    public void iniciarCorreioVoz() {
        System.out.println("VOCÊ ACESSOU O CORREIO DE VOZ.......");
    }
}
