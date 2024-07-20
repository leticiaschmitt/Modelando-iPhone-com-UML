package repositories;

import java.util.HashMap;

public class Musicas{
    private HashMap<String, String> musicas;

    public Musicas(){
        musicas = new HashMap<String, String>();
        //mockup
        musicas.put("Light It Up", "NEFFEX");
        musicas.put("Take Control ", "NEFFEX");
    }

    public boolean verificarMusica(String musica){
        if(musicas.containsKey(musica)){
            return true;
        }
        return false;
    }

}