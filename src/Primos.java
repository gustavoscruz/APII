import java.util.Scanner;

public class Primos {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        System.out.print("Enter the number: ");
        number = input.nextInt();

        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0){
                sum++;
            }
        }

        if(sum >= 2){
            System.out.print("The number " + number + " is not prime");
        }
        else{
            System.out.print("The number " + number + " is prime");
        }

        input.close();
    }
}
