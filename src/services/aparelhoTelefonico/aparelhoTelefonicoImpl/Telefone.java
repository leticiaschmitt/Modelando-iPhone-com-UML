package services.aparelhoTelefonico.aparelhoTelefonicoImpl;

import java.util.List;

import repositories.CorreioDeVoz;
import services.aparelhoTelefonico.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    private CorreioDeVoz correioDeVozRepository;

    public Telefone(){
        correioDeVozRepository = new CorreioDeVoz();
    }

    public void ligar (String number){
        System.out.println("Ligando para "+number);
    }
    public void atender(String number){
        System.out.println("Atendendo o número: "+number);
    }
    public void iniciarCorreioDeVoz(){
        List<String> correioDeVoz = correioDeVozRepository.getCorreioDeVoz();
        System.out.println("Reproduzindo áudios: ");
        for(String audio: correioDeVoz){
            System.out.println(audio);
        }
    }
}
