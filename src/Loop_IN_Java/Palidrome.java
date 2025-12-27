package Loop_IN_Java;
import java.util.* ;

public class Palidrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int n = sc.nextInt();
        int rem= 0 ;  int rev = 0  ;
        int a = n ;
        while (a>0){
            rem = a%10 ;
            rev = rev*10 + rem ;
            a = a/10 ;
        }
        if(rev==n){
            System.out.println(n+" is a Palidrome ");
        }
        else{
            System.out.println(n+" is not a Palidron No. ");
        }

    }
}
