package Abstraction_Interface;

public abstract class Employee {
    String name ;
    abstract void calculate_salary();

}
class Fulltime_Emp extends Employee{
    void calculate_salary(){
        System.out.println("Salary is fixed 50000 ");
    }
}

class Parttime_Emp extends Employee{

    int hour ;
//    Parttime_Emp(int hours ){
//        this.hour = hours ;
 //   }
    void setHour(int hour){
        if (hour>=1&&hour<=10){
            this.hour = hour ;
        }
        else{
            System.out.println("Invalid hours are given ");
        }
    }

    void calculate_salary(){
        System.out.println("Salary is depended uppon hours "+hour*500);
    }

    public static void main(String[] args) {
        Fulltime_Emp obj = new Fulltime_Emp();
        obj.calculate_salary();

        Parttime_Emp obj1 = new Parttime_Emp();
        obj1.setHour(8);
        obj1.calculate_salary();


    }
}
