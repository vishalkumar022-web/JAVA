package Exception_Handling;

public class Qno13 {
void Find_length(){

    String s = null ;
    try{
        System.out.println(s.length());
    }
    catch (Exception e){
        System.out.println("You Enter NO any Input in String then How to FInd length  ");
    }


}
    public static void main(String[] args) {

   Qno13 sc = new Qno13();

   sc.Find_length();



    }
}
