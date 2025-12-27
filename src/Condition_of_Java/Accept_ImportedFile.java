package Condition_of_Java; // ye toh Normal Package ka name ho gya jisme ye Accept_ImportedFile.java file hai

import Loop_IN_Java.import_file ; // ye wo file Import karane ka method hai jis se hamne wo file ko import kiya hai es
                                 // file me taaki ham us file ke method ko isme call kr ske.. PAHLE import then PACKAGE NAME.File_name

public class Accept_ImportedFile { // ye hamara current file Class
    public static void main(String[] args) {  // Main method

        import_file sc = new import_file() ; // Create a Object us class ke Name se Bnayenge jis Class ke method ko Hme Call krna hai

        int result = sc.factorial(5);  // Call that another method of Class from this Class ;

        System.out.println("Factorial of a Given No. is "+result); // Print the Resultant value which come after calling the Method..


    }
}
