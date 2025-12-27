package Encapsulation;

import java.text.BreakIterator;

public class Qno1 {
    private String name ;
    private int age ;
    private String Email ;

    // Constructor :-->

    Qno1(String name , int age , String Email){

//        setAge(age);
//        setEmail(Email);
//        setName(name);

//        this.age = age ;
//        this.name = name;
//        this.Email = Email ;

    if(this.age>0&&this.age<120){
        this.age = age;
    }
    else{
        System.out.println("Invalid age passed through Constructor ");
    }

        this.name = name;


        int flag = 0 ;
        for(int i = 0 ; i<Email.length(); i++){

            if(Email.charAt(i)=='@') {
                flag = 1;
                break;
            }
        }
        if(flag==1){
            this.Email = Email ;
        }
        else{
            System.out.println("Invalid Email given through constructor ");
        }
    }

    // Setter for Name ..
public void setName(String name){
        this.name = name;
}

    // Setter for Age..

    public void setAge(int age ){

        if(age>0&&age<120){
            this.age = age ;
        }
        else{
            System.out.println("Invalid age given through setter method ");
        }

    }
    // Setter for Email ..

    public void setEmail(String Email) {
//        int flag = 0 ;
//        for(int i = 0 ; i<Email.length(); i++){
//
//            if(Email.charAt(i)=='@') {
//                flag = 1;
//                break;
//            }
//        }
//        if(flag==1){
//            this.Email = Email ;
//        }
//        else{
//            System.out.println("Invalid Email given through setter method");
//        }



            // direct check — kya Email me '@' present hai?
            if (Email.contains("@")) {
                this.Email = Email;
            } else {
                System.out.println("Invalid Email given through setter method");
            }
        }

    @Override
    public String toString() {
        return "Qno1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Qno1 obj = new Qno1("bablu",-20,"vishalsingh37040gmail.com");
        obj.setName("vishal");
        obj.setAge(45);
        obj.setEmail("rajsingh@34043");

        System.out.println(obj);
    }
    }



