package Encapsulation;

import org.w3c.dom.ls.LSOutput;

public class Qno14 {
        // ------- Private Fields -------
        private String itemName;
        private double price;
        private int quantity;
        private String category;

        // ------- Constructor -------
        public Qno14(String itemNamename, double price, int quantity, String category) {
            this.itemName = itemNamename;
            this.price = price;
            this.quantity = quantity;
            this.category = category;
        }

        // ------- Getter Methods -------
        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getCategory() {
            return category;
        }

        // ------- Set Quantity (must be positive) -------
        public void setQuantity(int q) {
            if (q > 0) {
                quantity = q;
                System.out.println("Quantity updated.");
            } else {
                System.out.println("Invalid quantity! Must be positive.");
            }
        }

        // ------- Update Price (must be positive) -------
        public void updatePrice(double newPrice) {
            if (newPrice > 0) {
                price = newPrice;
                System.out.println("Price updated.");
            } else {
                System.out.println("Invalid price! Must be positive.");
            }
        }

        // ------- Total Cost = price × quantity -------
        public double getTotalCost() {
            return price * quantity;
        }

        // ------- Apply Discount (0% to 100%) -------
        public void applyDiscount(double percentage) {

            if (percentage >= 0 && percentage <= 100) {
                double discountAmount = (price * percentage) / 100;
                price = price - discountAmount;
                System.out.println(percentage + "% discount applied!");
            } else {
                System.out.println("Invalid discount! Must be between 0 and 100.");
            }
        }

        // ------- Item Summary -------
        public String getItemSummary() {
            return "Item: " + itemName +
                    "\nCategory: " + category +
                    "\nPrice: " + price +
                    "\nQuantity: " + quantity +
                    "\nTotal Cost: " + getTotalCost();
        }
    }

    class Online_ShopingCart{
        public static void main(String[] args) {
            Qno14 obj = new Qno14("Biscuits",100,50,"food items ");

            System.out.println(obj.getPrice());
            System.out.println(obj.getTotalCost());

            obj.setQuantity(20);
            obj.updatePrice(200);
            System.out.println(obj.getTotalCost());

            System.out.println(obj.getPrice());

            System.out.println(obj.getItemSummary());
        }

    }


