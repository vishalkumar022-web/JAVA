package Condition_of_Java;

public class literal_to_ConvertBinary_toDec {
    public static void main(String[] args) {
        int Binary = 0b1010 ;     // 0B ya 0b prefix hai to Direct convert binary to Decimal ;
        int octal = 075 ;   // 0 ak prefix hai same octal value ke liye to convert into Decimal Form ;
        int Hexa = 0x1A ;    // Same 0x ya 0X prefix hai to direct Convert Hexadecimal value to Decimal Form ;

        System.out.println("Decimal value of Binary is "+Binary);
        System.out.println("Decimal value of Octal is "+octal);
        System.out.println("Decimal value of HexaDecimal Value is "+Hexa);

    }
}
