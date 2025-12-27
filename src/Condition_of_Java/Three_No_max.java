package Condition_of_Java;

import java.util.Scanner;

public class Three_No_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b , c ;
        System.out.println("Enter the value of a ");
        a = sc.nextInt();

        System.out.println("Enter the value of b ");
        b = sc.nextInt();

        System.out.println("Enter the value of c ");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is Max ");
            }
            else{
                System.out.println("c is Max ");
            }
        }
        else if(b>c){
            System.out.println("b is max ");
        }
    else{    System.out.println("C is max ");
    }

    }
}
