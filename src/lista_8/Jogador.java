package lista_8;

public class Jogador {
    private String cpf;
    private String nome;
    private int gols;

    public Jogador(String cpf, String nome, int gols) {
        this.cpf = cpf;
        this.nome = nome;
        this.gols = gols;
    }

    public Jogador(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    @Override
    public String toString(){
        return "O jogador " + this.nome + " de CPF " + this.cpf + " possui " + this.gols + " gols";
    }
}
