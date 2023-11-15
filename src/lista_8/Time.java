package lista_8;

import java.util.ArrayList;

public class Time {

    private String nome;
    private String cnpj;
    private String endereco;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public Time(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Time(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean contrataJogador(Jogador jogador){
        if(consultaJogador(jogador.getCpf()) == null){
            jogadores.add(jogador);
            return true;
        }
        else {
            return false;
        }
    }

    public void demitiJogador(Jogador jogador){
        jogadores.remove(jogador);
    }

    public Jogador consultaJogador(String cpf){
        for(Jogador j : jogadores){
            if(j.getCpf().equals(cpf)){
                return j;
            }
        }
        return null;
    }

    public int quantidadeJogadores(){
        return jogadores.size();
    }
}
