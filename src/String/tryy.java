package String;

//import java.util.logging.SocketHandler;
//
//public class tryy {
//    public static void main(String[] args) {
//        String arr = "vishal" ;
//        System.out.println(arr);
//
//        String brr = arr ;
//        System.out.println(brr);
//
//        for(int i = 0 , j = arr.length() ; i<=j ; i++ , j--){
//            char temp = arr.charAt(i);
//            arr.charAt(i) = arr.charAt(j);
//            arr.charAt(j)= temp ;
//        }
//           if(arr.equalsIgnoreCase(brr)){
//               System.out.println("Palidron");
//           }
//           else{
//               System.out.println("Not a Palidron");
//           }
//    }
//}
public class tryy {
    public static void main(String[] args) {

        String arr = "vishal";
        System.out.println(arr);

        String brr = arr;   // original copy

        // Step 1: String -> char array
        char[] ch = arr.toCharArray();

        // Step 2: Reverse char array
        for(int i = 0, j = ch.length - 1; i < j; i++, j--){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        // Step 3: char array -> String
        arr = new String(ch);

        // Step 4: Compare
        if(arr.equalsIgnoreCase(brr)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
