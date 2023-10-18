import java.util.Scanner;

public class FormatacaoEmail {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String email = "";

        System.out.print("Enter full name: ");
        String name = input.nextLine().toLowerCase().trim().replaceAll("\\s+", " ");
        String[] fullName = name.split(" ");

        for(int i = 0; i < fullName.length; i++){
            email = (email + fullName[i].charAt(0));
        }

        System.out.print(email + "@empresa.com.br");

        input.close();
    }
}
