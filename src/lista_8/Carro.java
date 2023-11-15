package lista_8;

public class Carro {
    private Motor motor;
    private Pneus pneus;
    private Bancos bancos;

    private String cor;

    public Carro(Motor motor, Pneus pneus, Bancos bancos) {
        this.motor = motor;
        this.pneus = pneus;
        this.bancos = bancos;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pneus getPneus() {
        return pneus;
    }

    public void setPneus(Pneus pneus) {
        this.pneus = pneus;
    }

    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double precoDoCarro(){
        return motor.getPreco() + bancos.getPreco() + pneus.getPreco();
    }
}
