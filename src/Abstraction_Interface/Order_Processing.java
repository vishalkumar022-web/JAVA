package Abstraction_Interface;

public interface Order_Processing {
    void placeOrder();

}

class ONline_Order implements Order_Processing{
    int orderID ;

    ONline_Order(int orderID){
        this.orderID = orderID;
    }
    @Override
    public void placeOrder() {
        System.out.println("your Online order is in Process and Your orderID is "+orderID);
    }
}

class offline_Order implements Order_Processing{
    int orderID ;

    offline_Order(int orderID){
        this.orderID = orderID;
    }
    @Override
    public void placeOrder() {
        System.out.println("your offline order is in Process and Your orderID is "+orderID);
    }

    public static void main(String[] args) {
        ONline_Order obj = new ONline_Order(1234);
        offline_Order obj1 = new offline_Order(3025);

        obj.placeOrder();
        obj1.placeOrder();
    }
}