```mermaid
classDiagram
    class MusicPlayer {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    
    class Phone {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class InternetBrowser {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    class iPhone {
        -musicPlayer : MusicPlayer
        -phone : Phone
        -internetBrowser : InternetBrowser
    }

    iPhone --> MusicPlayer
    iPhone --> Phone
    iPhone --> InternetBrowser
