package Multithreading;

 class Demo extends Thread{

     public static void main(String[] args) {

         System.out.println(Thread.currentThread().getName());

         Thread.currentThread().setName("Vishal");
         System.out.println(Thread.currentThread().getName());
Demo.currentThread().setName("rahul");
         System.out.println(Thread.currentThread().getName());

         System.out.println(Thread.currentThread());
     }

}
