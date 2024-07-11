package funcionalidades.navegador;

public class Navegador implements NavegadorInternet {
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("ABRINDO NOVA ABA...");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO A PÁGINA...");
    }

    
}
