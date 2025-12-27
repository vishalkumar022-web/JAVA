package Condition_of_Java;
import java.util.* ;
public class Switch_Case {
    int a , b ;

    public static void main(String[] args) {
        Switch_Case input = new Switch_Case();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number ");
        input.a = sc.nextInt();

        System.out.println("Enter your 2nd number ");
        input.b = sc.nextInt();

        System.out.println("Enter your  Symbols ");
         char c = sc.next().charAt(0);

        switch(c){
            case '+':
                System.out.println("Addition of a and b is "+(input.a+input.b));
                break;

            case '-':
                System.out.println("Subtraction of a and b is "+(input.a-input.b));
                break;

            case '*':
                System.out.println("Multiplication of a and b is "+(input.a*input.b));
                break;

            case '/':
                System.out.println("Division of a and b is "+(input.a/input.b));
                break;

            case '%':
                System.out.println("Modulus of a and b is "+(input.a%input.b));
                break;

            default:
                System.out.println("invalid input "+ c);
                break;

        }


    }
}
