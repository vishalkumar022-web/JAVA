package Loop_IN_Java;
import java.util.*;
public class Prime_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter your number ");
        n = sc.nextInt();

        int count = 0 ;
        for(int i = 2; i<=n-1 ; i++){
            if(n%i==0){
                count++ ;
            }
        }
        if(count==0){
            System.out.println(n+" is a Prime Number ");
        }
        else{
            System.out.println(n+" is not a Prime Number ");
        }




    }
}
