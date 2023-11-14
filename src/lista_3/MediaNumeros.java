package lista_3;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int counter = -1;
        float sum = 0, number = 0;

        do{
            sum = sum + number;
            counter++;
            System.out.print("Enter the number: ");
            number = input.nextFloat();
        } while(number != 0);

        System.out.print("The average is: " + sum / counter);

        input.close();
    }
}
