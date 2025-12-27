package Inheritance;

public class Account {

    int balance ;

    void showBalance(){
        System.out.println("YOur current balance is "+balance);
    }

    Account(int balance){
        this.balance = balance;
        this.showBalance();
    }

}

class Saving_Account extends Account{
    int interest ;

    @Override
    void showBalance(){
        System.out.println("Balance with interest: "+(balance+(balance*interest/100)));
    }

    Saving_Account(int balance , int interest){
        super(balance);
        this.interest = interest ;

        this.showBalance();

    }

    public static void main(String[] args) {
        Saving_Account obj = new Saving_Account(1000,10);
    }
}
