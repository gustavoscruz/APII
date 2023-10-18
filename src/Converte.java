import java.util.Scanner;

public class Converte {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String finalName = "";

        System.out.print("Enter name: ");
        String name = input.nextLine().toLowerCase().trim().replaceAll("\\s+", " ");
        String[] newName = name.split(" ");
        if(newName.length >= 2) {
            for (int i = 0; i < newName.length; i++) {
                finalName = finalName + newName[i].charAt(0);
            }
        }



        System.out.println(finalName + "@empresa.com.br");

        input.close();
    }
}
