package Condition_of_Java;
import java.util.Scanner;
public class Divisible_by3And_5 {
    int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Divisible_by3And_5 input = new Divisible_by3And_5();

        System.out.println("Enter your number ");
        input.n = sc.nextInt();

        if(input.n%3==0){
            if(input.n%5==0){
                System.out.println(input.n +" is divisible by Both 3 and 5 ");
            }
            else{
                System.out.println(input.n + " is Divisible by 3 only ");
            }
        }
        else if (input.n%5==0){
            System.out.println(input.n + " is Divisible by 5 only ");
        }
        else{System.out.println(input.n + " is not Divisible by  Both 3 and  5 ");}



    }
}
