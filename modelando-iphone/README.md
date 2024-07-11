## DESAFIO POO DIO

**UML ABAIXO**


```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String exemplo)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tel.ligar("(11) 12345-6789");
        +safari.exibirPagina("https://www.dio.me/");
        +ipod.selecionarMusica("Lovely Rita");
    }
    
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
