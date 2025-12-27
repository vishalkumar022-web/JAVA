package Polymerphism;

import java.util.Scanner;

public class VVI_Overloading {

   void show(){
       System.out.println("here you can sum  number ");
   }
   int a ;

   void show(int b , int c ){
       System.out.println("Sum of all number is "+(a+b+c));
   }

   VVI_Overloading(int a , int b , int c ){

       this.a = a ;
       this.show();
       this.show(b,c);

    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a , b , c ");

        int a = sc.nextInt();     int b = sc.nextInt();    int c = sc.nextInt();

        VVI_Overloading obj =  new VVI_Overloading(a,b,c);

    }
}
