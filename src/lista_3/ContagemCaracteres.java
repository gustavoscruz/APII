package lista_3;

import java.util.Scanner;

public class ContagemCaracteres {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int sum = 0;
        char letter;

        System.out.print("Enter the phrase: ");
        String phrase = input.nextLine();
        System.out.println(phrase);

        for(int i = 0; i < phrase.length(); i++){
            letter = phrase.charAt(i);
            if(Character.isUpperCase(letter)){
                sum++;
            }
        }

        System.out.print("In this phrase, " + sum + " characters are uppercase");

        input.close();
    }
}
