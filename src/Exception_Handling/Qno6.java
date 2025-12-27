package Exception_Handling;

public class Qno6 extends RuntimeException{

    Qno6(String msg){
        super(msg);
    }

    static void Costume_Check_VotingAge(int age){
        try {
            if(age<18){
                throw new Qno6("You are not eligible for Voting ");
            }
            System.out.println("you are Eligible for Voting ");
        }
        catch (Exception e ){
            System.out.println("your age is less than 18 so, you are UnderAged for Voting ");
        }

    }

    public static void main(String[] args) {
      Qno6.Costume_Check_VotingAge(15);
    }


}
