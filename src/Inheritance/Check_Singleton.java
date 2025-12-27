package Inheritance;

public class Check_Singleton {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.get_obj();
        Singleton obj2 = Singleton.get_obj();

        if(obj1 ==obj2){
            System.out.println("Both are Pointing the same Obj. ");
        }
        else{
            System.out.println("Both are not Pointing the same Obj. ");
        }

        obj1.method();
    }
}