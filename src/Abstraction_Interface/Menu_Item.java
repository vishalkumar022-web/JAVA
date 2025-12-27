package Abstraction_Interface;

    public abstract class Menu_Item {
        String name;
        double price;



        abstract void prepare();
    }

    class VegBurger extends Menu_Item {

        VegBurger(String name , double price) {
           this.name = name;
           this.price= price;

        }

        @Override
        void prepare() {
            System.out.println("Preparing Veg Burger with fresh veggies and cheese.");
        }
    }

    class ChickenBurger extends Menu_Item {

        ChickenBurger(String name , double price) {
            this.name = name;
            this.price= price;

        }

        @Override
        void prepare() {
            System.out.println("Preparing Chicken Burger with crispy grilled chicken.");
        }
    }

    class ColdDrink extends Menu_Item {

        ColdDrink(String name , double price) {
            this.name = name;
            this.price= price;

        }

        @Override
        void prepare() {
            System.out.println("Pouring chilled cold drink into a glass.");
        }

        public static void main(String[] args) {

            VegBurger v = new VegBurger("VegBurger",140);
            ChickenBurger c = new ChickenBurger("ChickenBurger",250);
            ColdDrink d = new ColdDrink("ColdDrink",40);

            // Test Scenario
            v.prepare();
            System.out.println("Price: ₹" + v.price);

            c.prepare();
            System.out.println("Price: ₹" + c.price);

            d.prepare();
            System.out.println("Price: ₹" + d.price);
        }
    }


