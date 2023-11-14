package lista_4;

import java.util.Scanner;

public class ContagemChar {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the phrase: ");
        String phrase = input.nextLine();

        System.out.print("The phrase has " + phrase.length() + " characters");


        input.close();
    }
}
