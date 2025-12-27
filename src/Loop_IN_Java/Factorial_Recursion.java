package Loop_IN_Java;
import java.util.*;
public class Factorial_Recursion {

    int factorial(int a,int c){
        if(a==1){
            return c ;
        }
        c = c*a ;
        a-- ;
       return factorial(a,c);

    }

    public static void main(String[] args) {
        Factorial_Recursion input = new Factorial_Recursion();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number ");
        int n = sc.nextInt();

        int result = input.factorial(n,1);

        System.out.println("Factorial of a given Number is "+result);



    }
}
