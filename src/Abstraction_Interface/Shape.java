package Abstraction_Interface;

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    // abstract method
    abstract double area();

    public String toString() {
        return name + " Area = " + area();
    }
}
class Circle extends Shape {
    double radius;

    Circle(String name,double radius) {
        super(name);
        this.radius = radius;
    }

    double area() {
        return (22/7)*( radius * radius);
    }
}
class Rectangle extends Shape{

    int height ;
    int width ;
    Rectangle(String name ,int height, int width){
        super(name);
        this.height= height;
        this.width= width;
    }
    double area(){
        return height*width ;
    }

    public static void main(String[] args) {
        Circle obj = new Circle("Circle",7);
        Rectangle obj1 = new Rectangle("Rectangle",5,4);

        System.out.println(obj);
        System.out.println(obj1);
    }
}
