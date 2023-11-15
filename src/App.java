import lista_8.*;


public class App {
    public static void main(String[] args){

        Musica digaSimPraMim = new Musica("Diga sim pra mim", "desejo de menina", 3, "099");
        Musica rapsodia = new Musica();
        Playlist forro = new Playlist("Forro");

        rapsodia.setIsrc("019");

        forro.adicionarMusica(digaSimPraMim);
        forro.adicionarMusica(rapsodia);
        System.out.println(forro.listarMusicas());
    }
}

