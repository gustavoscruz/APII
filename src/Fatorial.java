import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        long number, factorial = 1;

        System.out.print("Enter the number: ");
        number = input.nextLong();

        while (number >= 1){
            factorial = factorial * number;
            number--;
        }
        System.out.print("The factorial is " + factorial);

        input.close();
    }
}
