package services.reprodutorMusical.reprodutorMusicalImpl;

import repositories.Musicas;
import services.reprodutorMusical.ReprodutorMusical;

public class AppleMusic implements ReprodutorMusical{

    private static Musicas musicasRepository = new Musicas();

    public void tocar(Boolean musicaExiste){
        if(musicaExiste){
            System.out.println("Reproduzindo música ");
        }
        else{
            System.out.println("Música não encontrada");
        }
    }
    public void pausar(Boolean musicaExiste){
        if(musicaExiste){
            System.out.println("Pausando música ");
        }
        else{
            System.out.println("Música não encontrada");
        }
    }
    public Boolean selecionarMusica(String musica){
        return musicasRepository.verificarMusica(musica);
    }
    
}
