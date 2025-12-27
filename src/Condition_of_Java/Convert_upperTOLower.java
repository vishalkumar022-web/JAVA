package Condition_of_Java;
import java .util.* ;
public class Convert_upperTOLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter your character ");

       char  c = sc.next().charAt(0);

        if(c>='A'&&c<='Z'){
         c = (char)(c+32);           // By using TypeCasting Method
//            c = Character.toLowerCase(c);
            System.out.println("your lowercase value is "+c);
        }
        else if(c>='a'&& c<='z'){
//            c = (char)(c-32);
            c = Character.toUpperCase(c);
            System.out.println("Your uppercase value is "+c);
        }

        else{
            System.out.println("Invalid Input");
        }


    }
}
