//package Condition_of_Java;
//import java.util.Scanner;
//public class odd_Even_UserInput {
//
//    int n ;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        odd_Even_UserInput input = new odd_Even_UserInput();
//
//        System.out.println("Enter your Number : ");
//        input.n = sc.nextInt() ;
//
//        if(input.n%2==0){
//            System.out.println(input.n +" is a Even number ");
//        }
//        else{
//            System.out.println(input.n +"is a odd number ");
//        }
//    }
//}


package Condition_of_Java;
import java.util.Scanner;
public class odd_Even_UserInput {

   static int n ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Number : ");
       n = sc.nextInt() ;

        if(n%2==0){
            System.out.println(n +" is a Even number ");
        }
        else{
            System.out.println(n +"is a odd number ");
        }
    }
}
