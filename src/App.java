import lista_8.*;


public class App {
    public static void main(String[] args){
        Pneus pirelli = new Pneus();
        Motor mercedes = new Motor();
        Bancos couro = new Bancos();
        Pneus pipa = new Pneus(100, "Bom", "Gustavo");
        Motor mercede = new Motor(200, 1000, "mercedes");
        Bancos confort = new Bancos(5000, "bom", "national");
        Carro fusca = new Carro(mercedes, pirelli, couro);
        Carro camaro = new Carro(mercede, pipa, confort);
        System.out.println(fusca.precoDoCarro());
        System.out.println(camaro.precoDoCarro());

    }
}

