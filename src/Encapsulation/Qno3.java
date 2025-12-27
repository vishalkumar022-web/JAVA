package Encapsulation;

public class Qno3 {

    private double radius ;

    Qno3(double radius){
        if(radius>0){
            this.radius = radius ;
        }
        else{
            System.out.println("Invalid radius is Given through Constructor ");
        }
    }

    void setRadius(double radius){
        if(radius>0){
            this.radius = radius;
        }
        else{
            System.out.println("Invalid radius is Given through Setter method ");
        }
    }
    double getRadius(){
        return radius ;
    }

    double getArea(){
        return( 22/7*radius*radius);
    }

    double getCircumference(){
        return( 2*22/7*radius);
    }

    double getDiameter(){
        return( 2*radius);
    }
}
class check {
    public static void main(String[] args) {
        Qno3 obj = new Qno3(-10);

        obj.setRadius(5);

        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
        System.out.println(obj.getCircumference());
        System.out.println(obj.getDiameter());

    }
}
