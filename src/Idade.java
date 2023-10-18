import java.util.Scanner;
public class Idade {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int age;

        System.out.print("How old are you: ");
        age = input.nextInt();

        if(age > 0 && age <= 10){
            System.out.print("You're a child");
        }
        else if (age > 10 && age <= 24){
            System.out.print("You're an adolescent");
        }
        else if (age > 24 && age < 65){
            System.out.print("You're an adult");
        }
        else{
            System.out.print("You're an elderly");
        }

        input.close();
    }
}
