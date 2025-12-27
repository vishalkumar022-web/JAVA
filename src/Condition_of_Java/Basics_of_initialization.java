package Condition_of_Java;

public class Basics_of_initialization {
    int a ;
    static float b ;
    char c = 'a';

    public static void main(String[] args) {
        Basics_of_initialization input = new Basics_of_initialization();
        int d = 20 ;
        input.c = (char)(input.c + 32) ;
        System.out.println("The value of a = "+input.a);
        System.out.println("The value of b = "+input.b);
        System.out.println("The value of c = "+input.c);
        System.out.println("The value of d = " + d);
    }
}
