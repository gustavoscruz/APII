import java.util.Scanner;

public class TabelaMultiplicacao{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " X " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
