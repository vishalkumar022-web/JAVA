package Method_in_Java;
import java.util.* ;

public class Predefined_Fn {


    int a = 10 ;
    int b = 20 ;

    public static void main(String[] args) {

       Predefined_Fn sc = new Predefined_Fn();

       int max = Integer.max(sc.a, sc.b);

       //  OR

        int Max = Math.max(sc.a,sc.b);

        System.out.println(Max);

        System.out.println(max);
    }
}
