package funcionalidades.telefone;

public class Telefone implements AparelhoTelefonico{
    public void ligar(String numero){
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
    }
    public void atender(){
        System.out.println("ATENDENDO TELEFONE...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("TOCANDO CORREIO DE VOZ...");
    }

}
