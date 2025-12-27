package Loop_IN_Java;
import java.util.* ;
public class Count_the_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int count = 0 ;
        while(n>0){
            count++ ;
            n/=10 ;

        }
        System.out.println("Count of a Given Dighit is "+count);


    }

}
