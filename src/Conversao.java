import java.util.Scanner;

class Conversao{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double dollars, euro, conversionRate;

        System.out.print("Enter the value in Dollar: ");
        dollars = input.nextDouble();
        System.out.print("Enter the conversion rate: ");
        conversionRate = input.nextDouble();
        euro = dollars * (0.93 * (1 - conversionRate / 100));
        System.out.print(dollars + " dollars converted to euros are " + euro);

        input.close();

    }
}