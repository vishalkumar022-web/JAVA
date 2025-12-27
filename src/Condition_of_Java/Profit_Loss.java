package Condition_of_Java;
import java.util.Scanner;
public class Profit_Loss {

    int n ;
    int m ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Profit_Loss inp = new Profit_Loss();

        System.out.println("Enter your Selling Price ");
        inp.n = sc.nextInt();
        System.out.println("Enter your Cost Price ");
        inp.m = sc.nextInt();

        if(inp.n>= inp.m){
            if(inp.n>inp.m){
            System.out.println("Profit = "+(inp.n-inp.m));
            }
            else{ System.out.println("No Profit No Loss ");
            }
        }
        else{
            System.out.println("Loss = "+(inp.m-inp.n));
        }

    }
}
