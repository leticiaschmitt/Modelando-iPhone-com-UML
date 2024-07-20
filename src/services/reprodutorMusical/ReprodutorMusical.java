package services.reprodutorMusical;

public interface ReprodutorMusical {
    void tocar(Boolean musicaExiste);
    void pausar(Boolean musicaExiste);
    Boolean selecionarMusica(String musica);
}
