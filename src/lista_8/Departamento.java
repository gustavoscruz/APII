package lista_8;

import java.util.ArrayList;

public class Departamento {

    private String name;
    private String numero;
    private String email;
    private String telefone;
    private ArrayList<Professor> professor = new ArrayList<Professor>();

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

    public void addProfessor(Professor professor1){
        professor.add(professor1);
    }

    public void removeProfessor(Professor professor1){
        professor.remove(professor1);
    }
}
