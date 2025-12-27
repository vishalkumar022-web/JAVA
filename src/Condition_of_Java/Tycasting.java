package Condition_of_Java;
import java.util.Scanner ;
public class Tycasting {

double d ;

    public static void main(String[] args) {
        Tycasting input = new Tycasting();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Decimal Num : " );
        input.d = sc.nextDouble();

        int a = (int)(input.d) ;   // Explicit Typecasting
        System.out.println("Decimal to integer Conversion is "+a);


    }

}
