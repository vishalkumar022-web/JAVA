package Encapsulation;

public class Qno15 {

    private String brand;
    private String model ;
    private int batteryLevel ;
    private int volume ;
    private boolean isOn ;


    // Constructor :---

    Qno15(String brand, String model){
        this.batteryLevel = 100 ;
        this.brand = brand ;
        this.model = model;
        this.volume= 5 ;
        this.isOn = false ;
    }

    public void turnOn(){
        if(batteryLevel==0){
            System.out.println("Phone gets dead due to Battery Please take the PHone on Charging ");

        }
        else {
            isOn = true;
            System.out.println("YOUr phone gets turn Onn ");
        }
    }

    public void turnOff(){
        isOn = false ;
        System.out.println("Your phone get turn Off ");
    }

    public void chargeBattery(int amount){
        if(amount<0){
            System.out.println("Invalid Amount is Given ");
        } else if (amount>100) {
            batteryLevel = 100 ;
            System.out.println("Battery get full charged ");
        }
        else{
            batteryLevel+=amount ;
            System.out.println("Battery charged Succesfully "+amount+"%");
        }
    }

    public void useBattery(int amount){
        if(amount>=100){
            batteryLevel= 0 ;
            isOn = false;


        } else if (amount<100){
            batteryLevel-=amount ;
            System.out.println("I am using "+amount+" of Battery and Remaining battery level is "+batteryLevel);
        }
    }



    public void setVolume(int volume){
        if (volume>=0&&volume<=10){
            this.volume = volume ;
        }
        else{
            System.out.println("invalid input Volume ");
        }
    }

    public String getPhoneStatus() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Battery: " + batteryLevel + "%" +
                ", Volume: " + volume +
                ", Power: " + isOn;
    }

}
class PhoneSystem{
    public static void main(String[] args) {
        Qno15 obj = new Qno15("Samsung","s24 Ultra");

        obj.turnOn();
        System.out.println(obj.getPhoneStatus());

        obj.useBattery(100);
        System.out.println(obj.getPhoneStatus());
        obj.turnOn();
        obj.chargeBattery(80);
        obj.turnOn();
        System.out.println(obj.getPhoneStatus());
        obj.useBattery(50);
        System.out.println(obj.getPhoneStatus());
    }
}