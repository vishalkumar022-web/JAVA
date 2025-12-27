package Loop_IN_Java;
import java.util.* ;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number for which you want to Print Table ");
            int n = sc.nextInt();

        System.out.println("Table of a given no is ");
            for(int i = 1 ; i<=10 ; i++){
                System.out.println(n+"*"+i +"="+ n*i);
            }

    }
}
