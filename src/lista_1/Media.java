package lista_1;

import java.util.Scanner;
public class Media {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float note1, note2, note3, media;

        System.out.print("Enter the first note: ");
        note1 = input.nextFloat();
        System.out.print("Enter the second note: ");
        note2 = input.nextFloat();
        System.out.print("Enter the third note: ");
        note3 = input.nextFloat();
        media = (note1 + note2 + note3) / 3;
        System.out.print("The average of the notes is: " + media);

        input.close();
    }
}
