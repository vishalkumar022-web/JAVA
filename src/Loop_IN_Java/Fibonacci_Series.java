//package Loop_IN_Java;
//import java.util.* ;
//public class Fibonacci_Series {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Your nth term ");
//        int n = sc.nextInt();
//
//        int a = 0 , b= 1 , sum = 0 ;
//        for (int i = 1 ; i<=n ; i++){
//            System.out.println(a);
//            sum= a+b ;
//            a = b ;
//            b = sum;
//        }
//
//    }
//}


// Fibbonacci series Between the Range:--->

package Loop_IN_Java;
import java.util.* ;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your SP term ");
        int i = sc.nextInt();

        System.out.println("Enter Your EP term ");
        int n = sc.nextInt();

        int a = 0 , b= 1 , sum = 0 ;
        for (; a<=n;){
            if(a>=i) {
                System.out.println(a);
            }
            sum= a+b ;
            a = b ;
            b = sum;
        }

    }
}
