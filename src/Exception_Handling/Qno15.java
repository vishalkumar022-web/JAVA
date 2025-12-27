package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Qno15 {

    void Reader(){

        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
            String line ;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("FIle not Exist then how can you read a file ");
        }

    }

    public static void main(String[] args) {

        Qno15 sc = new Qno15();

          sc.Reader();

    }

}
