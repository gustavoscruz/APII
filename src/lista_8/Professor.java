package lista_8;

public class Professor {

    private String cpf;
    private String nome;
    private String formacao;
    private double salario;

    public Professor(String cpf, String nome, String formacao, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.formacao = formacao;
        this.salario = salario;
    }

    public Professor(){

    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }
    public void reajustarSalario(double reajustePercentual){
        this.salario = this.salario * (1 + (reajustePercentual / 100));
    }
}
