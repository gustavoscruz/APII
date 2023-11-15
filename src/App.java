import lista_8.*;


public class App {
    public static void main(String[] args){

        Pais brazil = new Pais("Brasil", 20000, 200000000);
        Pais argentina = new Pais("Argentina", 10000, 30000000);
        Pais equador = new Pais("Equador", 5000, 15000000);
        Pais peru = new Pais("Peru", 1500, 200000);
        Pais colombia = new Pais("colombia", 2000, 10000000);
        Continente americaDoSul = new Continente("America do Sul");

        americaDoSul.adicionarPais(brazil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(equador);
        americaDoSul.adicionarPais(peru);
        System.out.println(americaDoSul.paisMaispopuloso());
        System.out.println(americaDoSul.paisMenosPopuloso());
        System.out.println(americaDoSul.densidadePopulacional());
        System.out.println(americaDoSul.dimensaoDoContinente());
        System.out.println(americaDoSul.populacaoDoContinente());
        americaDoSul.adicionarPais(colombia);
        System.out.println(americaDoSul.densidadePopulacional());
        System.out.println(americaDoSul.dimensaoDoContinente());
        System.out.println(americaDoSul.populacaoDoContinente());
    }
}

