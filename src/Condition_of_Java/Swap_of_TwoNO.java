//package Condition_of_Java;
//
//import java.util.Scanner;
//
//public class Swap_of_TwoNO {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a ; int b ;
//
//        System.out.println("Enter your a number ");
//        a = sc.nextInt();
//        System.out.println("Enter your b number ");
//        b = sc.nextInt();
//
//        int temp = a ;
//        a = b ;
//        b = temp ;
//        System.out.println("The value of a After swaping is "+a);
//        System.out.println("The value of b After swaping is "+b);
//
//    }
//}


//SWAP WITHOUT 3RD VARIABLE ;

package Condition_of_Java;

import java.util.Scanner;

public class Swap_of_TwoNO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ; int b ;

        System.out.println("Enter your a number ");
        a = sc.nextInt();
        System.out.println("Enter your b number ");
        b = sc.nextInt();

      a = a + b ;
      b = a - b ;
      a = a - b ;
        System.out.println("The value of a After swaping is "+a);
        System.out.println("The value of b After swaping is "+b);

    }
}
