
         // **** MOST VVI QUESTIION :--->


package Inheritance;

public class Student {
    String name ;

    void Dispalay (){
        System.out.println("Here some student Info ");
    }
    Student (String name){
        this.name = name  ;

    }
}

class Marksheet extends Student{


    int math_marks ;
    int Physices_marks ;
    int chemistry_marks ;

    void Display(){
        System.out.println("Name : "+name + "\n" + "Total marks :- "+ (chemistry_marks+math_marks+Physices_marks));
    }

    Marksheet (String name , int math_marks, int chemistry_marks,int physices_marks){

        super(name); // Normally bhi parent constructor ko call krne ke liye child constructor se hame super() karna hi padta hai bs yaha () me name bhi pass kar diye
        // jo ki Help krega parent const. me value assign krne ke liye bhi passing name through super(name) Yaani by using super keyword..
        this.chemistry_marks= chemistry_marks ;
        this.math_marks= math_marks ;
        this.Physices_marks = physices_marks ;

        super.Dispalay();

        this.Display(); // this refer a current object toh main method me bhi toh call karne ke liye yahi likhna padta hai current_Obj.Display yani Obj.Display
        // same wahi chiz constructor se call kr liye by using this keyword..

    }

    public static void main(String[] args) {
        Marksheet obj = new Marksheet("vishal kumar ",98,72,85);
//        obj.math_marks = 98 ;
//        obj.Physices_marks = 85;
//        obj.name = "vishal Kumar ";
//        obj.chemistry_marks = 72 ;


    }
        }


