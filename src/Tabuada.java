import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + number * i);
        }

        input.close();
    }
}
