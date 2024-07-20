package services.navegadorDeInternet.navegadorDeInternetImpl;

import repositories.AbasDeInternet;
import services.navegadorDeInternet.NavegadorDeInternet;

public class Safari implements NavegadorDeInternet{

    AbasDeInternet abasDeInternetRepository;

    public Safari(){
        this.abasDeInternetRepository = new AbasDeInternet();
    }

    public void exibirPagina(String pagina){
        System.out.println("Página de internet "+pagina);
    }
    public boolean adicionarNovaAba(String pagina){
        return abasDeInternetRepository.adicionarPagina(pagina);
    }
    public void atualizarPagina(String pagina){
        System.out.println("Página "+pagina+" atualizada");
    }
    
}
