import java.util.Scanner;
public class Salario {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float hourlyPrice, workedHours, grossSalary;

        System.out.print("Enter Hourly Price: ");
        hourlyPrice = input.nextFloat();
        System.out.print("Enter worked hours: ");
        workedHours = input.nextFloat();
        grossSalary = hourlyPrice * workedHours;
        System.out.print("Your gloss salary is " + grossSalary + " dollars");
    }
}
