import java.util.Scanner;
public class Crescente {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word1, word2, word3;

        word1 = input.nextLine().toLowerCase();
        word2 = input.nextLine().toLowerCase();
        word3 = input.nextLine().toLowerCase();

        if(word1.equals("vertebrado")){
            if (word2.equals("ave")){
                if(word3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else{
                    System.out.println("pomba");
                }
            }
            else{
                if(word3.equals("onivoro")){
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");
                }
            }
        }
        else{
            if(word2.equals("inseto")){
                if (word3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else{
                    System.out.println("lagarta");
                }
            }
            else{
                if(word3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else{
                    System.out.println("minhoca");
                }
            }

        }

        input.close();
    }
}
