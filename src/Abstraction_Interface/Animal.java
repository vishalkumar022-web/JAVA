package Abstraction_Interface;

public abstract class Animal {
    abstract void makeSound();

    }
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("DOgs barks");
    }

    void Describle(){
        System.out.println("Dogs are different in Colour ");
    }
}
class cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat sounds like meow ");
    }
    void Describle(){
        System.out.println("Cats are different in Colour ");
    }
}
class cow extends Animal{
   @Override
    void makeSound(){
       System.out.println("cow Sounds is like maa");
    }
    void Describle(){
        System.out.println("cows are different in Colour ");
    }

    public static void main(String[] args) {
        cow c = new cow();
        cat a = new cat();
        Dog d = new Dog();

        c.makeSound();
        c.Describle();
        a.Describle();
        a.makeSound();
        d.Describle();
        d.makeSound();
    }
}