import services.aparelhoTelefonico.AparelhoTelefonico;
import services.aparelhoTelefonico.aparelhoTelefonicoImpl.Telefone;
import services.navegadorDeInternet.NavegadorDeInternet;
import services.navegadorDeInternet.navegadorDeInternetImpl.Safari;
import services.reprodutorMusical.ReprodutorMusical;
import services.reprodutorMusical.reprodutorMusicalImpl.AppleMusic;

public class App {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico aparelhoTelefonico = new Telefone();
        NavegadorDeInternet navegadorDeInternet = new Safari();
        ReprodutorMusical reprodutorMusical = new AppleMusic();

        aparelhoTelefonico.atender("85999999999");
        aparelhoTelefonico.ligar("11988888888");
        aparelhoTelefonico.iniciarCorreioDeVoz();

        navegadorDeInternet.adicionarNovaAba("google.com");
        navegadorDeInternet.atualizarPagina("facebook.com");
        navegadorDeInternet.exibirPagina("gmail.com");

        reprodutorMusical.pausar(reprodutorMusical.selecionarMusica("Light It Up"));
        reprodutorMusical.tocar(reprodutorMusical.selecionarMusica("Light It Up"));

    }
}
