package lista_8;

public class Pais {
    private String nome;
    private double area;
    private long populacao;


    public Pais(String nome, double area, long populacao){
        this.nome = nome;
        this.area = area;
        this.populacao = populacao;
    }
    public Pais(){

    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public long getPopulacao(){
        return populacao;
    }

    public void setPopulacao(long populacao){
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", area=" + area +
                ", populacao=" + populacao +
                '}';
    }
}
