package lista_8;

import java.util.ArrayList;

public class Departamento {

    private String name;
    private String numero;
    private String email;
    private String telefone;
    private ArrayList<Professor> professor = new ArrayList<Professor>();


    public Departamento(String name, String numero, String email, String telefone){
        this.name = name;
        this.numero = numero;
        this.email = email;
        this.telefone = telefone;
    }

    public Departamento(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean addProfessor(Professor professor1){
        if(consultarProfessor(professor1.getCpf()) == null){
            professor.add(professor1);
            return true;
        }
        else
            return false;
    }

    public void removeProfessor(Professor professor1){
        professor.remove(professor1);
    }

    public int quantidadeProfessores(){
        return professor.size();
    }

    public Professor consultarProfessor(String cpf){
        for(Professor p : professor)
            if(p.getCpf().equals(cpf))
                return p;
        return null;

    }
}
