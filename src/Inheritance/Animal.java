package Inheritance;
import java.util.Scanner ;
public class Animal {

    Animal(){     // Animal constructor
        System.out.println("THis is the Animal Class");
    }

    void sound(){
        System.out.println("hey this is a Sound of Animal ");
    }

}

class Dog extends Animal {

    Dog(){  // Child Constuctor
        System.out.println("THis is the DOg Class");
    }
    void sound(){
        System.out.println("DOgs Barks ");
    }

    public static void main(String[] args) {
        Animal obj = new Dog();   // COnstructor call from here

        obj.sound();

    }
}
