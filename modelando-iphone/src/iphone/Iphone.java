package iphone;


import funcionalidades.ipod.ReprodutorMusical;
import funcionalidades.navegador.NavegadorInternet;
import funcionalidades.telefone.AparelhoTelefonico;


public class Iphone implements ReprodutorMusical,       AparelhoTelefonico, NavegadorInternet {
    public void exibirPagina(String url){
        System.out.println("EXIBINDO PÁGINA DO SAFARI: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("ABRINDO NOVA ABA DO SAFARI...");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO A PÁGINA...");
    }

    public void ligar(String numero){
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
    }
    public void atender(){
        System.out.println("ATENDENDO IPHONE...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("TOCANDO CORREIO DE VOZ...");
    }

    public void tocar(){
        System.out.println("TOCANDO MUSICA...");
    }
    public void pausar(){
        System.out.println("MÚSICA PAUSADA.");
    }
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MUSICA: " + musica);
    }


}