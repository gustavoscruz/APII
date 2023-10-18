import java.util.Scanner;
public class MaiorMenor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the end number: ");
        number2 = input.nextInt();

        if(number1 > number2){
            System.out.print("The number " + number1 + " is greater than the number " + number2);
        }
        else{
            System.out.print("The number " + number2 + " is greater than the number " + number1);
        }
        input.close();
    }
}
