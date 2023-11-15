package lista_8;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas = new ArrayList<Musica>();

    public Playlist(String nome){
        this.nome = nome;
    }
    public Playlist(){

    }

    public String getNome(){
        return nome;
    }

    public void SetNome(String nome){
        this.nome = nome;
    }

    public String reproduzirMusica(Musica musica){
        if(consultarMusica(musica.getIsrc()) == null) {
            return "A musica " + musica.getTitulo() + " não está na playlista";
        }
        else {
            return "A musica " + musica.getTitulo() + " está sendo reproduzida";
        }
    }

    public Musica consultarMusica(String isrc){
        for (Musica m : musicas){
            if(m.getIsrc().equals(isrc)){
                return m;
            }
        }
        return null;
    }

    public boolean adicionarMusica(Musica musica){
        if(consultarMusica(musica.getIsrc()) == null){
            musicas.add(musica);
            return true;
        }
        else {
            return false;
        }

    }

    public boolean removerMusica(Musica musica){
        if(consultarMusica(musica.getIsrc()) == null){
            return false;
        }
        else {
            musicas.remove(musica);
            return true;
        }
    }

    public String listarMusicas(){
        for(Musica m : musicas){
            System.out.println(m.getIsrc());
        }
        return "ok";
    }

    public int quantidadeDeMusicas(){
        return musicas.size();
    }

}
