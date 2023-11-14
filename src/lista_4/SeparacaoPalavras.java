package lista_4;

import java.util.Arrays;
import java.util.Scanner;

public class SeparacaoPalavras {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the phrase: ");
        String sentence = input.nextLine();
        String[] newSentence = sentence.split(" ");

        for(int i = 0; i < newSentence.length; i++){
            System.out.println(newSentence[i]);
        }

        input.close();
    }
}
