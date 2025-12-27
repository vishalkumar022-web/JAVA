package Abstraction_Interface;

public abstract class Logger_System {
    abstract void logger(String message);
}
class File_logger extends Logger_System{
    @Override
    void logger(String message) {
        System.out.println(message);
    }
}

class Console_logger extends Logger_System{

    @Override
    void logger(String message) {
        System.out.println(message);
    }
}

class database_logger extends Logger_System{
    @Override
    void logger(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        File_logger obj = new File_logger();
        Console_logger obj1 = new Console_logger();
        database_logger obj2 = new database_logger();

        obj.logger("My java code is Running in intellijia console");
        obj1.logger("MY java code file is in java file");
        obj2.logger("There are two type of database ");
    }
}