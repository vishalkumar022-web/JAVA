package Exception_Handling;

public class Qno14 extends  RuntimeException{
    Qno14(String msg){
        super(msg);
    }

    static void Check_Balance(int Balance , int Withdrawal){

        if(Withdrawal>Balance){
            throw new Qno14("Insufficient Balance ");
        }
        System.out.println("Sufficient Balance is Present in Your Account ");

    }

    public static void main(String[] args) {

      try {
          Check_Balance(1000,1500);
      }
      catch (Exception e){
          System.out.println("You want to Withdrawal more than your main Balance  ");
      }

    }

}
