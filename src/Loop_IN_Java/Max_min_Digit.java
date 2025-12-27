package Loop_IN_Java;
import java.util.* ;
public class Max_min_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number ");
        int n = sc.nextInt() ;

        int max = 0 , min = 9 ;

        while(n>0){
            int digit = n%10 ;
            if(digit>max){
                max = digit;
            }
             if (digit<min){
                 min = digit ;
             }
             n= n/10 ;
        }


        System.out.println("Max digit "+max);
        System.out.println("Min digit "+min);

    }
}
