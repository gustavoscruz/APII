import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        if(number % 2 == 0){
            System.out.print("The number " + number + " is pair");
        }
        else{
            System.out.print("The number " + number + " is odd");
        }
        input.close();
    }
}