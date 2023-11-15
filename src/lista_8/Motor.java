package lista_8;

public class Motor {
    private int potencia;
    private double preco;
    private String fabricante;

    public Motor(int potencia, double preco, String fabricante) {
        this.potencia = potencia;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public Motor(){

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
