package Array;

import java.util.Scanner;

public class Object_Creation {

    String name ;
    int age ;
    Object_Creation(String name , int age ){
        this.name = name ;
        this.age = age ;

    }

    public static void main(String[] args) {
//        Object_Creation[] s = new Object_Creation[3]; // yaha 3 student's ke liye

//        s[0] = new Object_Creation("Vishal ",18); // object1 bana.
//        s[1] = new Object_Creation("manish",19); // object 2 bana.
//        s[2] = new Object_Creation("Prince",17);// object 3
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][];
         arr[0]= new int[3];
        arr[1]= new int[1];
        arr[2]= new int[2];
        for (int i = 0 ; i< arr.length ; i++){
            for (int j = 0 ; j< arr[i].length ; j++){
                arr[i][j] = sc.nextInt();

            }
        }
        for(int i = 0 ; i< arr.length; i++){
            for (int j = 0 ; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
