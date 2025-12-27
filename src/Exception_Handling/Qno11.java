package Exception_Handling;

public class Qno11 {

        void divide(int a, int b) {
            try {
                int res = a / b;
                System.out.println("Result: " + res);
            }
            catch (Exception e) {
                System.out.println("Error occurred in divide() method");
              //  throw e;//  RE-THROW
                throw new RuntimeException("Divison Fail");

            }
        }

        public static void main(String[] args) {
            Qno11 sc = new Qno11();
            try {
                sc.divide(10,0);
            }
            catch (Exception e) {
                System.out.println("Handled again in main()");
            }
        }
    }
