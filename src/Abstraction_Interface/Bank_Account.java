package Abstraction_Interface;

public abstract class Bank_Account {
    int balance ;
    void depsit(){
    }

    abstract void Withdraw();
}

class saving_Account extends Bank_Account{
    int WithDraw_amount;
    void setWithDraw_amount(int withDraw_amount) {
        if (withDraw_amount > 10000) {
            System.out.println("Not allowed to withdraw more than 10000 in ONe times ");
        } else {
            this.WithDraw_amount = withDraw_amount;
            System.out.println(" Withdraw amount is set now call on Withraw method to withdraw money Sucessfully ");
        }
    }

    int deposited_Balance;

    public void setDeposited_Balance(int deposited_Balance) {
        this.deposited_Balance = deposited_Balance;
        System.out.println(" Deposited amount is set now call on  method deposit to withdraw money Sucessfully ");
    }

    @Override
    void depsit() {
        this.balance+=deposited_Balance ;
        System.out.println("Deposited balance is = "+deposited_Balance);
        System.out.println("your current amount on Account is "+this.balance);
    }

    @Override
    void Withdraw() {
        this.balance-= WithDraw_amount;
        System.out.println("Withdrawn Balance is = "+ WithDraw_amount);
        System.out.println("your current amount on Account is "+this.balance);
    }

}

class current_Account extends Bank_Account{

    int Withdraw_amount;
    void setWithdraw_amount(int withdraw_amount) {

            this.Withdraw_amount = withdraw_amount;
        System.out.println(" Withdraw amount is set now call on Withraw method to withdraw money Sucessfully ");
    }

    int deposited_Balance;

    public void setDeposited_Balance(int deposited_Balance) {
        this.deposited_Balance = deposited_Balance;
        System.out.println(" Deposited amount is set now call on Deposited method to withdraw money Sucessfully  ");
    }

    @Override
    void depsit() {
        this.balance+=deposited_Balance ;
        System.out.println("Deposited balance is = "+deposited_Balance);
        System.out.println("your current amount on Account is "+this.balance);
    }

    @Override
    void Withdraw() {
        this.balance-= Withdraw_amount;
        System.out.println("Withdrawn Balance is = "+ Withdraw_amount);
        System.out.println("your current amount on Account is "+this.balance);
    }



    public static void main(String[] args) {
        saving_Account obj = new saving_Account();
        current_Account obj1 = new current_Account();

        System.out.println(obj.balance);
        obj.depsit();
        obj.Withdraw();
        obj.setDeposited_Balance(10000);
        obj.depsit();
        obj.setWithDraw_amount(15000);
        obj.Withdraw();
    }
}