package Exception_Handling;

public class Qno8 {

    void check_Positive(int num) throws Exception {

        if (num < 0) {
            throw new Exception("You Enter -ve number ");
        }
        System.out.println("You Entered True Number ");
    }

    public static void main(String[] args) {
        Qno8 sc = new Qno8();
        try {
            sc.check_Positive(-5);
        } catch (Exception e) {
            System.out.println("You Entered -ve Number so, Please Enter Number > 0 ");
        }
    }
}