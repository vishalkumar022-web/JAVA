package Encapsulation;

public class Qno4 {
    private double length ;
    private double width ;

    Qno4(double length , double width){
        if (length>0){
            this.length = length ;

        }
        else {
            System.out.println("invalid length given through constructor ");
        }

        if(width>0){
            this.width = width ;
        }
        else{System.out.println("invalid width given through constructor ");}

    }


    void setLength(double length){
        if (length>0){
            this.length = length ;

        }
        else {
            System.out.println("invalid length given through setter method ");
        }
    }

    void setWidth(double width){

        if(width>0){
            this.width = width ;
        }
        else{System.out.println("invalid width given through setter method  ");}

    }

    double getLength(){
        return length;
    }

    double getWidth(){
        return width;
    }

    double getArea(){
        return (length*width);
    }

    double getPerimeter(){
        return 2*(length+width);
    }
    boolean IsSquare(){
        if(length==width){
            return true ;
        }
        else {
            return false ;

        }
    }

}
    class check1{
        public static void main(String[] args) {
            Qno4 obj = new Qno4(4,6);
            obj.setLength(-10);
            obj.setWidth(-10);

            System.out.println(obj.getArea());
            System.out.println(obj.getPerimeter());
            System.out.println(obj.IsSquare());
        }
    }

