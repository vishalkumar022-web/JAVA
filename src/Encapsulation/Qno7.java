package Encapsulation;

public class Qno7 {

    // Private fields as required
    private String Account_No;
    private String AccountHolder;
    private double balance;

    // Constructor - balance must start at 0
    Qno7(String Account_No, String AccountHolder) {
        this.Account_No = Account_No;
        this.AccountHolder = AccountHolder;
        this.balance = 0;
    }

    // Deposit method
    void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Only positive amount allowed.");
        }
    }

    // Withdraw method
    void Withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdraw amount must be positive.");
        }
        else if(amount>this.balance){
            System.out.println("Not sufficient balance is availlable ");
        }
        else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    // Check balance
    double getBalance() {
        return balance;
    }

    // Transfer method
    void Transfer(Qno7 otherAccount, double amount) {// **MOST VVI** Yaha samjho ye (Qno7 otherAccount) ak new hamne object banaya hai Qno7
        if (amount > 0 && amount <= balance) {//  Class ka hi jisme ham (obj1) jo ki Assume kiye hai otherAccount Details usko Store
            this.balance -= amount;     //  krenge.. yaani yaha ham paas karenge obj1 ak assumed otherAccount Details jisme hamko transfer krna hai Given (obj) ka Value
            otherAccount.balance += amount;
            System.out.println(amount + " transferred to " + otherAccount.Account_No);
        } else {
            System.out.println("Transfer failed due to low balance or invalid amount.");
        }
    }

    // Returns account info WITHOUT balance
    String getAccountInfo() {
        return "Account Number: " + Account_No +
                ", Account Holder: " + AccountHolder;
    }
}



class bankApp{
    public static void main(String[] args) {
        Qno7 obj = new Qno7("122568623","raj");  // ye Maan lo mera Account jo ki hai (obj) Object se value set hoga constructor se

        Qno7 obj1 = new Qno7("1234567890","Vishal singh"); // ye Maan lo jisko transfer karna hai uska account detail hai jo ki store hai (obj1) me iska bhi detail sets hoga constructor se hi


        obj.Deposit(1000);
        System.out.println(obj.getBalance());
        obj.Withdraw(520);
        System.out.println(obj.getBalance());
        obj.Withdraw(1000);

        obj.Deposit(1000);
        System.out.println(obj.getBalance());

        obj1.Deposit(100);
        System.out.println( obj1.getBalance());

        obj.Transfer(obj1,1000);

        System.out.println("Now availlable balance in my accunt "+obj.getBalance());
        System.out.println("Now availlable balance in another accunt "+obj1.getBalance());
    }
}
