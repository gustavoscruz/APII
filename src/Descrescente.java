import java.util.Scanner;

public class Descrescente{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int i = 10;

        while (i > 0){
            System.out.println(i);
            i--;
        }

        input.close();
    }
}
