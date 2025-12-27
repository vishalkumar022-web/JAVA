package Inheritance;
import java.util.Objects;
//
//class Test {
//    void showMessage() {
//        System.out.println("Hello from Parent class");
//    }
//}
//
//class Child extends Test {
//                         // recommended: helps catch mistakes
//    void showMessage() {
//        System.out.println("Hello from Child class");
//        super.showMessage();   // use of super keyword..
//    }
//
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.showMessage();// Child ka method run hoga -> "Hello from Child class"
//
//
//    }
//}




//class Test {
//    int id;
//    String name;
//    Test(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Test s1 = new Test(1, "Alice");
//        System.out.println(s1.toString());  // Default output (not readable)
//    }
//}


//class Test {
//    String name;
//    int age;
//
//    Test(String studentName, int studentAge) {
//        this.name = studentName;
//        this.age = studentAge;
//        System.out.println("Student Created: " + name + ", " + age);
//    }
//    public static void main(String[] args) {
//        Test s1 = new Test("vishal",18) ;
//        Test s2 = new Test("harsh",17) ;
//    }
//
//}


//class Test {
//    int age;
//    String name;
//    Test(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
// @Override
//    public String toString() {
//        return "Student{Age=" + age + ", Name='" + name + "'}";
//    }
//
//    public static void main(String[] args) {
//        Test s1 = new Test(25, "Saurav");
//
//        System.out.println(s1);
//    }
//
//}


class Test {
     String tittle ;
    String name;
    Test( String tittle, String name) {
        this.tittle = tittle;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Book{Tittle=" + tittle + ", Name='" + name + "'}";
    }

    public static void main(String[] args) {
        Test s1 = new Test("Jungle Book ", "Prince");

        System.out.println(s1);
    }

}


