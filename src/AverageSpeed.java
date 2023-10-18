import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double distance, timeSpent, velocity;

        System.out.print("Enter the distance traveled in kilometers: ");
        distance = input.nextFloat();
        System.out.print("Enter the spent time in hours: ");
        timeSpent = input.nextFloat();
        velocity = distance / timeSpent;
        System.out.print("The average speed was " + velocity + " Km/h");

        input.close();

    }
}
