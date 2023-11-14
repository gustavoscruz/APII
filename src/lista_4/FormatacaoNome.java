package lista_4;

import java.util.Scanner;

public class FormatacaoNome{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first and last name: ");
        String name = input.nextLine().toLowerCase().trim().replaceAll("\\s+", " ");
        //reading name without unnecessary spaces and with lowercase

        String[] newName = name.split(" ");
        newName[0] = newName[0].toUpperCase().charAt(0) + newName[0].substring(1);
        String finalName = (newName[0] + " " + newName[1].toUpperCase());

        System.out.println(finalName);

        input.close();
    }
}
