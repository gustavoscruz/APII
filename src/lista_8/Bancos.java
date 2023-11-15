package lista_8;

public class Bancos {
    private double preco;
    private String tipo;
    private String fabricante;

    public Bancos(double preco, String tipo, String fabricante) {
        this.preco = preco;
        this.tipo = tipo;
        this.fabricante = fabricante;
    }

    public Bancos(){

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
