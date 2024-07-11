package funcionalidades.ipod;

public class Ipod implements ReprodutorMusical{
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
