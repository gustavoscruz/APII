import java.util.Scanner;

public class ContagemVogais{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char letter;
        int vowels = 0;

        System.out.print("Enter the string: ");
        String sentence = input.nextLine();


        for(int i = 0; i < sentence.length(); i++){
                letter = sentence.toLowerCase().charAt(i);
                if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                   vowels++;
                }

        }

        System.out.print("In this sentence, there are " + vowels + " vowels" );

        input.close();
    }
}
