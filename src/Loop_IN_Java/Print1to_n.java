package Loop_IN_Java;
import java.util.* ;
public class Print1to_n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.println("Enter your nth number ");
        n = sc.nextInt();

        for (int i = 1 ; i<=n ;i++){
            System.out.println(i);
        }


    }
}
