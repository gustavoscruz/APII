package lista_1;

import java.util.Scanner;
public class Tempo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double distance, velocity, time;

        System.out.print("Enter distance in Km: ");
        distance = input.nextDouble();
        System.out.print("Enter velocity in Km/h: ");
        velocity = input.nextDouble();
        time = distance / velocity;
        System.out.print("The time of the trip is " + time + " hours");

        input.close();
    }
}
