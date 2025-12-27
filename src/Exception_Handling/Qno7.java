package Exception_Handling;

import java.io.FileReader;

public class Qno7 {

    void Checked_Exception()throws Exception{
        FileReader fr = new FileReader("abc.txt");
    }

    void Unchecked_Exception()throws RuntimeException{
        int a = 10 ;
        int b = 0 ;
        int c = a/b ;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Qno7 sc = new Qno7();

        try{
            sc.Checked_Exception();
        }
        catch (Exception e){
            System.out.println("this file is not Exist in System then How reading is Possible ");
        }

        try{
            sc.Unchecked_Exception();
        } catch (RuntimeException e) {
            System.out.println("Any Number can't Divided by Zero ");
        }

    }
}
