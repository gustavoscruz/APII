import java.util.Scanner;

public class SubstringReversa{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int initIndex, finishIndex;

        System.out.print("Enter the string: ");
        String sentence = input.nextLine();
        System.out.print("Enter the init index: ");
        initIndex = input.nextInt();
        System.out.print("Enter the finish index: ");
        finishIndex = input.nextInt();
        String inverted = new StringBuilder(sentence.substring(initIndex - 1, finishIndex)).reverse().toString();
        System.out.print(inverted);


        input.close();
    }
}
