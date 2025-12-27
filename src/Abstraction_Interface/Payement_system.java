

package Abstraction_Interface;

interface PaymentMethod {
    void pay(double amount);
}

// Credit Card Payment
class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

// UPI Payment
class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

// Cash Payment
class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }

    public static void main(String[] args) {

        PaymentMethod cc = new CreditCard();
        PaymentMethod upi = new UPI();
        PaymentMethod cash = new Cash();

        cc.pay(1000);
        upi.pay(500);
        cash.pay(300);
    }
}
