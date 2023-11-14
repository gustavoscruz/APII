package lista_7;

public class Arrays {
    public static double biggestElement(double[] array){
        double biggest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > biggest){
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int sum(int[] array) {
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        return soma;
    }

    public static float averageArray(float[]  array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum / array.length;
    }

    public static int numberOccurrence(int[] array, int num){
        int quantifyOccurrences = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                quantifyOccurrences++;
            }
        }
        return quantifyOccurrences;
    }

    public static int sumOfRows(int[][] matrix, int columns, int times){
        int sum = 0;
        for (int b = 0; b < columns; b++){
            sum += matrix[times][b];
        }
        return sum;
    }

    public static int[][] multiMatrix(int[][] matrix1, int[][] matrix2){
        int[][] finalMatrix = new int[3][3];
        for (int a = 0; a < matrix1.length; a++){
            for(int b = 0; b < matrix1.length; b++){
                for (int c = 0; c < matrix1.length; c++){
                    finalMatrix[a][b] += matrix1[a][c] * matrix2[c][b];
                }
            }
        }
        return finalMatrix;
    }

    public static int diagonalSum(int[][] matrix, int option){
        int sum = 0;
        if(option == 1) {
            for (int i = 0; i < matrix.length; i++){
                sum += matrix[i][i];
            }
        }
        else {
            for (int i = 0; i < matrix.length; i++){
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static int[][] transposed(int[][] matrix, int i, int j){
        int[][] transposedMatrix = new int[j][i];
        for(int a = 0; a < i; a++){
            for (int b = 0; b < j; b++){
                transposedMatrix[b][a] = matrix[a][b];
            }
        }
        return transposedMatrix;
    }

    public static void bubbleSort(int[] array){
        int aux = 0;
        for(int b = 0; b < array.length; b++){
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
        }
    }

    public static boolean isMagicMatrix(int[][] matrix){
        int mainDiagonalSum = 0, secondaryDiagonalSum = 0, rowSum = 0, columnSum = 0;
        for(int i = 0; i < matrix.length; i++){
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
        }
        if(mainDiagonalSum != secondaryDiagonalSum){
            return false;
        }
        else {
            for(int i = 0; i < matrix.length; i++){
                for (int b = 0; b < matrix.length; b++){
                    rowSum = matrix[i][b];
                    columnSum = matrix[b][i];
                }
                if(rowSum != columnSum || rowSum != mainDiagonalSum){
                    break;
                }
                rowSum = 0;
                columnSum = 0;
            }
            return true;
        }
    }

}