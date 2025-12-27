package Abstraction_Interface;

public abstract class Student_Report {
    String name ;
    int Roll ;
  abstract void generate_Report();

}
class Enginner_Student extends Student_Report{
    int marks ;
    Enginner_Student(String name , int Roll , int marks ){
        this.name = name;
        this.Roll = Roll ;
        setMarks(marks);
    }
    void setMarks(int marks){
        if(marks>=0&&marks<=100){
            this.marks = marks ;
        }
        else{
            System.out.println("Invalid marks is Given ");
        }
    }


    @Override
    void generate_Report() {
        if(marks>33){
        System.out.println("Name :-"+name+"\n Roll_No :- "+Roll+"\n Marks :- "+marks+"Grade "+"pass");
        }
        else{
            System.out.println("Name :-"+name+"\n Roll_No :- "+Roll+"\n Marks :- "+marks+"Grade "+"Fail ");
        }

    }
}

class Medical_Student extends Student_Report{
    int marks ;
    Medical_Student(String name , int Roll , int marks ){
        this.name = name;
        this.Roll = Roll ;
        setMarks(marks );
    }
    void setMarks(int marks){
        if(marks>=0&&marks<=100){
            this.marks = marks ;
        }
        else{
            System.out.println("Invalid marks is Given ");
        }
    }


    @Override
    void generate_Report() {
        if(marks>33){
            System.out.println("Name :-"+name+"\n Roll_No :- "+Roll+"\n Marks :- "+marks+"Grade "+"pass");
        }
        else{
            System.out.println("Name :-"+name+"\n Roll_No :- "+Roll+"\n Marks :- "+marks+"Grade "+"Fail ");
        }

    }
    public static void main(String[] args) {

     Enginner_Student obj = new Enginner_Student("Vishal kumar ",21,98);
     Medical_Student obj1 = new Medical_Student("Sweta singh",22,94);
     obj.generate_Report();
     obj1.generate_Report();


    }
}