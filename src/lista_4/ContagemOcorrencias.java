package lista_4;

import java.util.Locale;
import java.util.Scanner;

public class ContagemOcorrencias{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char letter;
        int occurrence = 0;

        System.out.print("Enter the String: ");
        String sentence = input.nextLine();
        System.out.print("Enter the letter: ");
        letter = input.next().charAt(0);

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == letter){
                occurrence++;
            }
        }
        System.out.print("The letter " + letter + " appears " + occurrence + " times");

        input.close();
    }
}
