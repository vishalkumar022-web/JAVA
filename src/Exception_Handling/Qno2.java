package Exception_Handling;

public class Qno2 {

    void array(int n )throws Exception{

        int [] arr = new int[5];
       // try {
            System.out.println(arr[n]);
       // }
      // catch (Exception e){
//            e.printStackTrace();
           System.out.println("Invalid Index ");
      // }
    }

    public static void main(String[] args) {
        Qno2 sc = new Qno2();

        try {
            sc.array(10);
        }
        catch (Exception e){
            System.out.println("Invalid Index number is Given");
        }
    }
}
