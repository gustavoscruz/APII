import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float sideA, sideB, sideC;

        System.out.print("Enter the side A of the triangle: ");
        sideA = input.nextFloat();
        System.out.print("Enter the side B of the triangle: ");
        sideB = input.nextFloat();
        System.out.print("Enter the side C of the triangle: ");
        sideC = input.nextFloat();

        if(sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB){
            System.out.print("It is not a triangle");
        }
        else if(sideA == sideB && sideA == sideC) {
            System.out.print("It is a equilateral triangle");
        }
        else if(sideA == sideB || sideA == sideC){
            System.out.print("It is a isosceles triangle");
        }
        else{
            System.out.print("It is a scalene triangle");
        }
        input.close();
    }
}
