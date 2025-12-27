package Inheritance;
import java.util.Scanner ;
public class Shape {

    void method (){
        System.out.println("calculating Area ");
    }

}

class Rectangle extends Shape {

    int length ;
    int breadth ;


    void method(){
        System.out.println("Area of Rectangle is :- "+length*breadth);
    }

    Rectangle (int length, int breadth){
        this.length = length ;
        this.breadth = breadth ;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length , breadth ;
        System.out.println("Enter your length ");
        length = sc.nextInt();
        System.out.println("ENter your Breadth ");
        breadth = sc.nextInt();
        Rectangle obj = new Rectangle(length,breadth);

        obj.method();
    }

}
