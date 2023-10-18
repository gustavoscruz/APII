import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int previous = 1, previousPrevious = 0, auxiliary = 0;

        System.out.println(previousPrevious);
        System.out.println(previous);

        for(int i = 0; i < 8; i++){
            auxiliary = previous;
            previous = previous + previousPrevious;
            previousPrevious = auxiliary;
            System.out.println(previous);
        }

        input.close();
    }
}
