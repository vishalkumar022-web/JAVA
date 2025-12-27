package Loop_IN_Java;
import java.util.* ;
public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int n = sc.nextInt();

        int rem = 0 ; int reverse = 0 ;

        while(n>0){
            rem = n%10 ;
            reverse = reverse*10 + rem ;
            n = n / 10 ;

        }
        System.out.println("Reverse of a Given Number is "+reverse);


    }
}
