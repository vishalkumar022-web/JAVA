package Exception_Handling;

public class Qno10 {

    void Method3(){
        System.out.println("Method 3 Started ");
         int x = 10 ;  int y = 0 ;
         int z = x/y ;
    }
    void Method2(){
        System.out.println("Method 2 Started ");
        Method3();
    }

    void Method1(){
    try{
        Method2();
    }
    catch (Exception e){
        System.out.println("Exception of Method3 is Handled in Method1 ");
    }
    }

    public static void main(String[] args) {
     Qno10 sc = new Qno10();
     sc.Method1();
    }
}
