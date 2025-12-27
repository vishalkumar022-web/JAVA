package Exception_Handling;

import java.util.Scanner;

public class Qno12 {

    void Take_integer() {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your Values ");
            int x = sc.nextInt();
            System.out.println("Sucessfully you Enter you Integer Number " + x);
        } catch (Exception e) {
            System.out.println("Please Enter only Integer Value ");
        }
    }

    public static void main(String[] args) {
        Qno12 obj = new Qno12();

          obj.Take_integer();

    }
}
