package Exception_Handling;

public class Qno5 {

    void Nested(){
        int a = 10 ;
        int b = 0 ;

        String s = null ;
        try {
            int x = s.length();
            System.out.println("Succesfully length Finded ");

            try {
                int c = a/b ;
                System.out.println("Succesfully Division Completed ");
            }
            catch (ArithmeticException e ){
                System.out.println("Any number can't Divided by Zero ");
            }
        }
        catch (NullPointerException e ){
            System.out.println("Not any character is passed then how to find length ");
        }
    }

    public static void main(String[] args) {
        Qno5 sc = new Qno5();
        sc.Nested();
    }

}
