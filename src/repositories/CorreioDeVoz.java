package repositories;

import java.util.ArrayList;
import java.util.List;

public class CorreioDeVoz {
    private List<String> correioDeVoz;

    public CorreioDeVoz(){
        this.correioDeVoz = new ArrayList<>();
        //mockup
        correioDeVoz.add("Mensagem 01");
        correioDeVoz.add("Messagem 02");
    }

    public List<String> getCorreioDeVoz(){
        return this.correioDeVoz;
    }
}
