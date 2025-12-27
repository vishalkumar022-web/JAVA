package Abstraction_Interface;

public abstract class Vehicles {

    String Brand ;
    int speed ;


    public void setSpeed(int speed) {
        if (speed > 300) {
            this.speed = 300;
            System.out.println("Speed more than 300km/hr is not allowed limit of Speed is only 300km/hr ");
        }
        else {
            this.speed = speed;
        }
    }
    public int getSpeed(){
        return speed ;
    }

    abstract void Drive ();

}
class car extends Vehicles{




    car(String Brand, int speed){
        this.Brand = Brand ;
        setSpeed(speed);
    }
    @Override
    void Drive() {
        System.out.println("Car brand is "+Brand +" And the Speed of that car is "+speed);
    }
}
class bike extends Vehicles{

    bike(String Brand, int speed){
        this.Brand = Brand ;
        setSpeed(speed);
    }

    @Override
    void Drive() {
        System.out.println("Bike brand is "+Brand +" And the Speed of that bike is "+speed);
    }

    public static void main(String[] args) {

        car obj = new car("fortuner",350);
        obj.Drive();

        bike obj1 = new bike("BMW",250);
        obj1.Drive();

        System.out.println(obj.getSpeed());
        System.out.println(obj1.getSpeed());
        obj1.setSpeed(300);

        obj1.Drive();

    }

}

