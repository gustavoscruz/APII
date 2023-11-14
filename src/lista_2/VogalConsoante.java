package lista_2;

import java.util.Scanner;
public class VogalConsoante {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char letter;

        System.out.print("Enter the letter: ");
        letter = input.next().charAt(0);

        switch(letter){
            case 'a': case 'e': case 'i': case 'o': case 'u': {
                System.out.print(letter + " is a vowel");
                break;
            }
            default: {
                System.out.print(letter + " is a consonant");
                break;
            }
        }


    input.close();
    }
}
