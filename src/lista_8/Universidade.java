package lista_8;

import java.util.ArrayList;

public class Universidade {

    private String nome;
    private String endereco;
    private ArrayList<Departamento> departamento = new ArrayList<Departamento>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean addDepartamento(Departamento departament){
        if(consultarDepartamento(departament.getNumero()) == null){
            departamento.add(departament);
            return true;
        }
        else
            return false;

    }

    public void removeDepartamento(Departamento departament){
        departamento.remove(departament);
    }

    public int quantidadeDepartamentos(){
        return departamento.size();
    }

    public Departamento consultarDepartamento(String numero){
        for(Departamento d : departamento)
            if(d.getNumero().equals(numero))
                return d;
        return null;
    }
}
