import java.util.Scanner;

public class RemocaoEspacos{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String sentence = input.nextLine();

        System.out.print(sentence.trim().replaceAll("\\s+", " "));

        input.close();
    }
}
