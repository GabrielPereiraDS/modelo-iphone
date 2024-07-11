package usuario;

import funcionalidades.ipod.ReprodutorMusical;
import funcionalidades.navegador.NavegadorInternet;
import funcionalidades.telefone.AparelhoTelefonico;
import iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonico tel = iphone;
        NavegadorInternet safari = iphone;
        ReprodutorMusical ipod = iphone;

        tel.ligar("(11) 12345-6789");
        safari.exibirPagina("https://www.dio.me/");
        ipod.selecionarMusica("Lovely Rita");

    }
}
