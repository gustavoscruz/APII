import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = SomaDeElementos.sum(elements);
        System.out.println(soma);
    }
}
