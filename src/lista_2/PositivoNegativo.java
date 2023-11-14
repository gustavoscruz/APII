import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        if(number > 0){
            System.out.print("The number " + number + " is positive");
        }
        else if(number < 0) {
            System.out.print("The number " + number + " is negative");
        }
        else{
            System.out.print("The number is equal to zero");
        }

        input.close();
    }
}
