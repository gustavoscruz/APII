package lista_8;

import java.util.ArrayList;

public class Continente {
    private String nome;
    private ArrayList<Pais> paises = new ArrayList<Pais>();

    public Continente(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public boolean adicionarPais(Pais pais){
        if(consultarPais(pais.getNome()) == null){
            paises.add(pais);
            return true;
        }
        else {
            return false;
        }
    }

    public Pais consultarPais(String nome){
        for(Pais p : paises){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    public double dimensaoDoContinente(){
        double dimensao = 0;
        for(Pais p : paises){
            dimensao += p.getArea();
        }
        return dimensao;
    }

    public long populacaoDoContinente(){
        long populacao = 0;
        for(Pais p : paises){
            populacao += p.getPopulacao();
        }
        return populacao;
    }

    public double densidadePopulacional(){
        return populacaoDoContinente() / dimensaoDoContinente();
    }

    public Pais paisMaispopuloso(){
        Pais maior = paises.get(0);
        for(Pais p : paises){
            if(maior.getPopulacao() > p.getPopulacao()){
                maior = p;
            }
        }
        return maior;
    }

    public Pais paisMenosPopuloso(){
        Pais menor = paises.get(0);
        for(Pais p : paises){
            if(menor.getPopulacao() < p.getPopulacao()){
                menor = p;
            }
        }
        return menor;
    }

}
