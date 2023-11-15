package lista_8;

public class Musica {
    private String titulo;
    private String artista;
    private int duracao;
    private String isrc;

    public Musica(String titulo, String artista, int duracao, String isrc){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.isrc = isrc;
    }

    public Musica(){

    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc){
        this.isrc = isrc;
    }

    public float controlarVelocidadeDeReproducao(float velocidade){
        return this.duracao / velocidade;
    }
}
