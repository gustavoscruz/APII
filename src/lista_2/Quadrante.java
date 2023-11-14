import java.util.Scanner;
public class Quadrante {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float x, y;

        System.out.print("Enter the abscissa: ");
        x = input.nextFloat();
        System.out.print("Enter the ordinate: ");
        y = input.nextFloat();

        if(x > 0 && y > 0){
            System.out.print("The point is in the first quadrant");
        }
        else if (x < 0 && y > 0){
            System.out.print("The point is in the second quadrant");
        }
        else if (x < 0 && y < 0){
            System.out.print("The point is in the third quadrant");
        }
        else if (x > 0 && y < 0){
            System.out.print("The point is in the fourth quadrant");
        }
        else{
            System.out.print("The point is on one of the axes");
        }

        input.close();
    }
}
