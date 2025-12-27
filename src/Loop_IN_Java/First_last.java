package Loop_IN_Java;
import java.util.* ;
public class First_last {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number ");
        int n = sc.nextInt();

        int last_no= 0 ,First_no= 0  ;
        last_no= n%10 ;

        while(n>=10){
            First_no = n/10 ;
            n = n/10 ;

        }
        System.out.println("First No is "+First_no+"\n last No. is "+last_no);



    }
}
