package Loop_IN_Java;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();

        int c = 1 ;

        for (int i = 1 ; i<=n ; i++){
            c = c * i ;
        }

        System.out.println("Factorial of a given Number "+c);
    }
}
