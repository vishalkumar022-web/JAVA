//package Loop_IN_Java;
//import java.util.*;
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your number ");
//        int n = sc.nextInt() ;
//
//    for(int i = 1 ;i<=n ;i++){
//        for (int j = 1 ; j<=n ;j++){
//            System.out.print("*  ");
//        }
//        System.out.println();
//    }
//
//    }
//
//}

// FOR TRIANGLE SHAPE :-->

//package Loop_IN_Java;
//import java.util.*;
//public class Pattern1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your number ");
//        int n = sc.nextInt() ;
//
//        for(int i = 1 ;i<=n ;i++){
//            for (int j = 1 ; j<=i ;j++){
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//
//    }
//
//}


// FOR DIAMOND SHAPE :--->

//package Loop_IN_Java;
//import java.util.*;
//public class Pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your number ");
//        int n = sc.nextInt() ;
//
//        int nsp = n/2 ; int nst = 1 ;  int a = n/2+1 ;
//        for(int i = 1 ;i<=n ;i++){
//            for (int j = 1 ; j<=nsp ; j++){
//                System.out.print(" ");
//            }
//            for(int k= 1 ; k<=nst ; k++){
//                System.out.print("*");
//            }
//            if(i<a){
//                nsp-- ;
//                nst+=2 ;
//            }
//            else{
//                nsp++;
//                nst-=2 ;
//            }
//            System.out.println();
//        }



// FOR HOLLOW SQUARE With Diognal :--->

package Loop_IN_Java;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number ");
        int n = sc.nextInt() ;

        for(int i = 1 ;i<=n ;i++){
            for (int j = 1 ; j<=n ;j++){
              if(i==1||i==n||j==1||j==n||i==j||i+j==n+1){
                  System.out.print("*");
            }
              else{
                  System.out.print(" ");
              }
        }
            System.out.println();

    }


    }

}