import java.util.Scanner;
public class Temperatura{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double temperature;

        System.out.print("Enter the temperature in Celsius: ");
        temperature = input.nextDouble();
        temperature = (temperature * 1.8) + 32;
        System.out.print("The temperature in Fahrenheit is: " + temperature);

        input.close();
    }
}
