package Condition_of_Java;
import java.util.Scanner;

public class Sort_3_No {
    static int a , b , c ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a ");
        a = sc.nextInt();
        System.out.println("Enter the Value of b ");
        b = sc.nextInt();
        System.out.println("Enter the Value of C ");
        c = sc.nextInt();

        if(a>b&&a>c){
            if(b>c){
                System.out.println("a is max , b is second max Then c is last ");
            }
            else{System.out.println("a is max , c is second max Then b is last ");}
        }
    else if(b>a&&b>c){
        if(a>c){
            System.out.println("b is max , a is second max Then c is last");
        }
        else{
            System.out.println("b is max , c is second max Then a is last");
        }
        }
    else if (c>a&&c>b){
        if(a>b){
            System.out.println("c is max , a is second max Then b is last");
        }
        else{
            System.out.println("c is max , b is second max Then a is last");
        }
        }




    }
}
