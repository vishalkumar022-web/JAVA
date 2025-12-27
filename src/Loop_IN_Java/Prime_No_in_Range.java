package Loop_IN_Java;
import java.util.*;
public class Prime_No_in_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int count = 0 ;
        System.out.println("Enter your SP Number ");
        int i = sc.nextInt();

        System.out.println("Enter your EP Number ");
        int n = sc.nextInt();

        while(i<=n){
            count = 0 ;
            for(int a = 1 ; a<=i ;a++){
                if(i%a==0){
                    count++;
                }
            }

            if(count ==2){
                System.out.println(i+" is a prime Number ");
            }
            else {
                System.out.println(i+" is not a prime Number ");
            }

            i++ ;

        }

    }
}
