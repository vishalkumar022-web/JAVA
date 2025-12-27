package Exception_Handling;

public class Qno4 {

    void Finally_Test(int a , int b){
        int num = a ;
        int denom = b ;

        try{
            int c = num/denom ;
            System.out.println(c);
        }
//        catch(ArithmeticException e ){
//            System.out.println("Any Number Can't Divided by Zero ");
//        }
        finally {
            System.out.println("You can easily Divide any Number Other than 0 ");
        }
    }

    Qno4(int x , int y ){
        this.Finally_Test(x,y);
    }
    public static void main(String[] args) {
        Qno4 sc = new Qno4(10,0);
    }
}
