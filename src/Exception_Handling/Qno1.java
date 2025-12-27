package Exception_Handling;

public class Qno1 {

    void Divide(int a , int b){
        int num = a ;
        int denom = b ;

        try{
            int c = num/denom ;
            System.out.println(c);
        }
        catch(ArithmeticException e ){
            System.out.println("Any Number Can't Divided by Zero ");
        }
    }

Qno1(int x , int y ){
        this.Divide(x,y);
}
    public static void main(String[] args) {
        Qno1 sc = new Qno1(10,0);
    }
}
