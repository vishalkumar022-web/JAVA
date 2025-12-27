package Encapsulation;

public class Qno12 {

        // ------ Private Fields ------
        private int productId;
        private String name;
        private double price;
        private int quantity;

        // ------ Constructor ------
        public Qno12(int ProductId, String name, double price, int quantity) {
           this.productId = ProductId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // ------ Getter Methods ------
        public int getProductId() {
            return productId;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        // ------ Set Price (Positive Only) ------
        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
                System.out.println("Price updated!");
            } else {
                System.out.println("Invalid price! Must be positive.");
            }
        }

        // ------ Add Stock ------
        public void addStock(int amount) {
            if (amount > 0) {
                quantity = quantity + amount;
                System.out.println(amount + " items added to stock.");
            } else {
                System.out.println("Invalid stock amount!");
            }
        }

        // ------ Sell Product ------
        public void sellProduct(int amount) {
            if (amount <= quantity && amount > 0) {
                quantity = quantity - amount;
                System.out.println(amount + " items sold.");
            } else {
                System.out.println("Not enough stock to sell!");
            }
        }

        // ------ Total Value ------
        public double getTotalValue() {
            return price * quantity;
        }

        // ------ Is in Stock ------
        public boolean isInStock() {
            if (quantity > 0){
                return true;
            }
            else
                return false;
        }
    }

    class InventoryManagement_system{
        public static void main(String[] args) {
            Qno12 obj = new Qno12(37040,"Rice",5000,50);
            obj.setPrice(2000);
            obj.sellProduct(30);
            System.out.println(obj.getPrice());

            System.out.println(obj.getTotalValue());

            obj.addStock(5);
            obj.sellProduct(60);
            System.out.println(obj.getQuantity());

            obj.sellProduct(25);

            System.out.println(obj.isInStock());

            obj.addStock(50);
            System.out.println(obj.getQuantity());
            System.out.println(obj.isInStock());

        }
    }

