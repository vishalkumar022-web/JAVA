package Encapsulation;

public class Qno8 {

    private String make ;
    private String model ;
    private int year ;
    private int millage ;
    private double fuelLevel ;

    //Constructor..

    Qno8(String make, String model, int year){
        this.make = make ;
        this.fuelLevel = 0;
        this.millage = 0;
        this.year = year;
        this.model = model ;

    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getMillage(){
        return millage;
    }

    public void addFuel(double gallons){

        if (fuelLevel+gallons<=15) {
            fuelLevel+=gallons;
            System.out.println("Fuel added succesfully ");
        }

        else {
            System.out.println("invalid fuel added Because tank capacity is Only 15 gallons ");
        }

    }

    public void Drive(int miles){
        millage+=miles ; // millage gets increase on increasing miles

        int Dec = miles/25; // ye 25mpg hai yaani metre per gallon yaha se pta chal jayega kita gallon use huaa hai to move a given miles
        fuelLevel-=Dec;  // yaha Dec(-) kr denge actual fuel level se..
    }

    public double getfuelLevel(){
        return fuelLevel;
    }

    public void canDrive(int miles){
        int requiredFuel = miles/25 ;

        if(requiredFuel>fuelLevel){
            System.out.println("not inoff fuel to Drive ");
        }
        else{
            System.out.println("yes you able to drive ");
        }
    }
}

class Car{
    public static void main(String[] args) {
        Qno8 obj= new Qno8("Toyota","Fortuner",2015);

        System.out.println(obj.getfuelLevel());
        System.out.println(obj.getMillage());

        obj.addFuel(10);
        System.out.println(obj.getfuelLevel());

        obj.Drive(100);
        System.out.println(obj.getMillage());
        System.out.println(obj.getfuelLevel());

        obj.canDrive(200);

        System.out.println(obj.getfuelLevel());

        obj.addFuel(15);
        System.out.println(obj.getfuelLevel());

    }
}
