package Inheritance;

public class Singleton {

   private static Singleton obj ;

     private Singleton (){
        System.out.println("hey Buddy we are Learning About design of java");
    }

    void  method(){
        System.out.println("here this is singleton design Pattern ");
    }

    public static Singleton get_obj(){
         if(obj==null){
             obj =  new Singleton();
             return obj ;
         }
         else{
             return obj ;

         }

   }

    public static void main(String[] args) {
        Singleton ss = new Singleton();

        ss.method();
    }
}
