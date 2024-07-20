package repositories;

import java.util.ArrayList;
import java.util.List;

public class AbasDeInternet {
    private List<String> abasDeInternet;

    public AbasDeInternet(){
        this.abasDeInternet = new ArrayList<>();
    }

    public boolean adicionarPagina(String pagina){
        try{
            abasDeInternet.add(pagina); 
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
