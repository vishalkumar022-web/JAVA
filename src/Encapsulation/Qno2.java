package Encapsulation;

public class Qno2 {
    private double result ;

    Qno2(){
        result = 0 ;
    }
    void add(double number){
        result+=number ;
    }
    void subtract(double number){
        result-=number;
    }

    void Multiply(double number){
        result*=number;
    }

    void Division(double number){
        if(number!=0) {
            result /= number;
        }
        else{
            System.out.println("DIvision is not possible ");
        }
    }

    double getResult(){
        return result;
    }

    double clearMethod(){
       return result = 0 ;
    }


    }
 class test {
     public static void main(String[] args) {
         Qno2 obj = new Qno2();

         System.out.println(obj.getResult());

         obj.add(10);
        obj.Multiply(5);

        obj.subtract(10);
        obj.Division(4);

         System.out.println(obj.getResult());

         System.out.println(obj.clearMethod());
     }
 }
