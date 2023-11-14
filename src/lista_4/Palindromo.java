package lista_4;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String sentence = input.nextLine();
        String invertedSentence = new StringBuilder(sentence).reverse().toString();

        if(sentence.equals(invertedSentence)){
            System.out.print("It's a palindrome");
        }
        else{
            System.out.print("It's not a palindrome");
        }

        input.close();
    }
}
