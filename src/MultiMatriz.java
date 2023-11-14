import java.util.Scanner;

public class MultiMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int[][] matrix3;
        for (int i = 0; i < matrix1.length; i++){
            for (int b = 0; b < matrix1.length; b++){
                System.out.print("Matrix1[" + i + "][" + b + "]: ");
                matrix1[i][b] = input.nextInt();
            }
        }
        for (int i = 0; i < matrix2.length; i++){
            for (int b = 0; b < matrix2.length; b++){
                System.out.print("Matrix2[" + i + "][" + b + "]: ");
                matrix2[i][b] = input.nextInt();
            }
        }
        matrix3 = Arrays.multiMatrix(matrix1, matrix2);
        for (int i = 0; i < matrix3.length; i++){
            for (int b = 0; b < matrix3.length; b++){
                System.out.println("Matrix3[" + i + "][" + b + "]: " + matrix3[i][b]);
            }
        }
    }
}
