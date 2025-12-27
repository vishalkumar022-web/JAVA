
package Condition_of_Java;
import java.util.Scanner;
public class Max_min {
    int c = 20  ;
    public static void main(String[] args) {
        Max_min input  = new Max_min() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter your First number ");
          int b = sc.nextInt();
        System.out.println("Enter your 2nd Number ");
        input.c = sc.nextInt();

        if(input.c>b){
            System.out.println("c is max " +input.c );
        }
        else if(input.c==b){
            System.out.println("b is Equal to C " );
        }
        else{
            System.out.println("b is max " + b);
        }
    }
}
