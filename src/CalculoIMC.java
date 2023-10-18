import java.util.Scanner;
public class CalculoIMC {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double height, weight, index;

        System.out.print("Enter height in KG: ");
        height = input.nextDouble();
        System.out.print("Enter weight in meters: ");
        weight = input.nextDouble();
        index = weight / (height * height);
        System.out.print("Your IMC is: " + index);

        input.close();
    }
}
