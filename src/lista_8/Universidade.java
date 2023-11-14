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
    public void addDepartamento(Departamento departament){
        departamento.add(departament);
    }

    public void removeDepartamento(Departamento departament){
        departamento.remove(departament);
    }
}
