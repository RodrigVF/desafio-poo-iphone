public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        meuIphone.getReprodutorMusical().selecionarMusica("Música boa");
        meuIphone.getReprodutorMusical().tocar();

        meuIphone.getAparelhoTelefonico().ligar("123-456-789");
        meuIphone.getAparelhoTelefonico().atender();

        meuIphone.getNavegadorInternet().exibirPagina("www.exemplo.com");
        meuIphone.getNavegadorInternet().adicionarNovaAba();
    }
}