package FuncionalidadeTelefonico.ReprodutorMusical;

public class Player implements MusicPlayer{
    public void play() {
        System.out.println("MÚSICA TOCANDO.......");
    }

    public void pause() {
        System.out.println("A MÚSICA FOI PAUSADA......");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A MÚSICA FOI SELECIONADA.......");
    }
}
