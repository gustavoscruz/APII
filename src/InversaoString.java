import java.util.Scanner;

public class InversaoString{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String phrase = input.nextLine();
        String invertedPhrase = new StringBuilder(phrase).reverse().toString();

        System.out.print("The inverted phrase is: " + invertedPhrase);
        
        input.close();
    }
}
