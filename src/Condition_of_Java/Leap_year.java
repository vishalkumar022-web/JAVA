//package Condition_of_Java;
//import java.util.Scanner ;
//
//public class Leap_year {
//    int n ;
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Leap_year input = new Leap_year();
//        System.out.println("Enter your Year ");
//        input.n = sc.nextInt();
//
//        if(input.n%4==0&&input.n%100!=0||(input.n%400==0)){
//            System.out.println(input.n + " is a leap year ");
//        }
//        else{
//            System.out.println(input.n + " is not a leap year ");
//        }
//    }
//
//}

package Condition_of_Java;
import java.util.Scanner ;

public class Leap_year {
    int n ;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leap_year input = new Leap_year();
        System.out.println("Enter your Year ");
        input.n = sc.nextInt();

        if(input.n%4==0) {
            if (input.n % 100 == 0) {
                if (input.n % 400 == 0) {
                    System.out.println(input.n + "is a leap year ");
                }
                else{System.out.println(input.n + "is not a leap year ");}
            }
            else{System.out.println(input.n + "is a leap year ");}
        }
        else{System.out.println(input.n + "is not a leap year ");}

    }

}
