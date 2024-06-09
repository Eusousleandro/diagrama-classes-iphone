package FuncionalidadeTelefonico.NavegadorInternet;

public class Internet implements AcessoNavegador {
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
