package Condition_of_Java;
import java.util.* ;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b  , c  ;
        System.out.println("Enter your 1st number ");
        a = sc.nextInt();
        System.out.println("Enter your 2nd number ");
         b= sc.nextInt();
        System.out.println("Enter your 3rd number ");
        c = sc.nextInt();

      String result =   (a>b)?(a>c)?("a is max "):("C is max"):(b>c)?("b is max "):("c is max");

        System.out.println(result);
    }
}
