package Abstraction_Interface;

public interface  Printer {
    void print(String document);

}
class jetPRinter implements Printer{
    @Override
     public void print(String document) {
        System.out.println(document+" is Printed by jetPrinter ");
    }
}
class laserPRinter implements Printer{
    @Override
    public void print(String document) {
        System.out.println(document+" is Printed by laser printer ");
    }

    public static void main(String[] args) {
        jetPRinter obj = new jetPRinter();
        laserPRinter obj1 = new laserPRinter();

        obj.print("my School Documents ");
        obj1.print("My Official Document ");
    }
}
