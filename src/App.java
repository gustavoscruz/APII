import java.util.Scanner;

public class App {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int[][] matrix = new int[3][3];
       for (int i = 0; i < matrix.length; i++){
           for (int b = 0; b < matrix.length; b++){
               System.out.print("Matrix[" + i + "][" + b + "]: ");
               matrix[i][b] = input.nextInt();
           }
       }
       System.out.println(Arrays.isMagicMatrix(matrix));
    }
}

