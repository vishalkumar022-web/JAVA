package Abstraction_Interface;

public abstract class Games {
    abstract void play();

    void start(){
        System.out.println("Game Started ");
    }
}
class chess extends Games{
    void start(){
        System.out.println("chess Started ");
    }
    void play() {
        System.out.println("chess is indoor game and only two player can play this game ");
    }
}
class Cricket extends Games{
    void start(){
        System.out.println("Cricket Started ");
    }

    @Override
    void play() {
        System.out.println("Cricet is Outdoor game and many of people can paticipate in this game ");
    }

    public static void main(String[] args) {
        Games obj = new Cricket();
        Games obj1 = new chess();
        obj.start();
        obj.play();
        obj1.start();
        obj1.play();

    }
}
