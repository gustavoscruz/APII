import java.util.Scanner;
public class Desconto {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float priceProduct, discount, newPrice;

        System.out.print("Enter the price of the product: ");
        priceProduct = input.nextFloat();
        System.out.print("Enter the discount of the product: ");
        discount = input.nextFloat();
        newPrice = priceProduct * (1 - discount / 100);
        System.out.print("The new price of the product is R$: " + newPrice);

        input.close();
    }
}
