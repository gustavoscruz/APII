package lista_3;

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int soma = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                soma = soma + i;
            }
        }

        System.out.print("The sum of even numbers from one to one hundred is: " + soma);

        input.close();
    }
}
