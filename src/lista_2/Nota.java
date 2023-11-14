import java.util.Scanner;

public class Nota {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float note;

        System.out.print("Enter the note: ");
        note = input.nextFloat();

        if(note >= 7){
            System.out.print("You're approved");
        }
        else{
            System.out.print("You're disapproved");
        }

        input.close();
    }
}
