import java.util.Scanner;
public class Conversor {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double meters, centimeters, milimeters;

        System.out.print("Enter in meters: ");
        meters = input.nextDouble();
        centimeters = meters * 100;
        milimeters = meters * 1000;
        System.out.println("In centimeters: " + centimeters);
        System.out.print("In milimeters: " + milimeters);

        input.close();
    }
}
