import lista_7.Arrays;
import lista_8.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Jogador gustavo = new Jogador("09197124524", "Gustavo", 100);
        Jogador vinicius = new Jogador("09197124520", "Vinicius", 100);

        Time flamengo = new Time();

        flamengo.contrataJogador(gustavo);
        flamengo.contrataJogador(vinicius);
        System.out.println(flamengo.quantidadeJogadores());
        flamengo.demitiJogador(vinicius);
        System.out.println(flamengo.quantidadeJogadores());
        System.out.println(flamengo.consultaJogador("09197124520"));
    }
}

