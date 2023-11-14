package lista_1;

import java.util.Scanner;
public class Adicao{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number1, number2, soma;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        soma = number1 + number2;
        System.out.print("The sum is: " + soma);
        input.close();
    }
}
