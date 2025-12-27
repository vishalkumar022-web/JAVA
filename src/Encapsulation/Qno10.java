package Encapsulation;

public class Qno10 {
        private double celsius;   // internally always store in Celsius

        // -------- Constructor --------
        public Qno10(double value, char unit) {

            if (unit == 'C' || unit == 'c') {
                setCelsius(value);
            }
            else if (unit == 'F' || unit == 'f') {
                setFahrenheit(value);
            }
            else if (unit == 'K' || unit == 'k') {
                setKelvin(value);
            }
            else {
                System.out.println("Invalid unit given! Use C, F, or K.");
                // Default 0°C store kar diya
                celsius = 0;
            }
        }

        // -------- Setter Methods (Brute Force) --------

        public void setCelsius(double temp) {

            // Absolute zero check (manual)
            if (temp < -273.15) {
                System.out.println("Temperature cannot be below absolute zero (-273.15°C)");
            }
            else {
                celsius = temp;
            }

        }

        public void setFahrenheit(double temp) {

            // Convert Fahrenheit -> Celsius
            double c = (temp - 32) * 5 / 9;

            if (c < -273.15) {
                System.out.println("Temperature cannot be below absolute zero (-273.15°C)");

            }
        else {
                celsius = c;
            }

        }

        public void setKelvin(double temp) {

            // Convert Kelvin -> Celsius
            double c = temp - 273.15;

            if (c < -273.15) {
                System.out.println("Temperature cannot be below absolute zero (-273.15°C)");
            }
            else {
                celsius = c;
            }

        }

        // -------- Getter Methods --------

        public double getCelsius() {
            return celsius;
        }

        public double getFahrenheit() {
            return (celsius * 9 / 5) + 32;
        }

        public double getKelvin() {
            return celsius + 273.15;
        }

        // -------- toString() --------

        public String toString() {

            return "Celsius: " + getCelsius() + "°C\n" +
                    "Fahrenheit: " + getFahrenheit() + "°F\n" +
                    "Kelvin: " + getKelvin() + "K";
        }
    }

    class Temperature_consersion_System{
        public static void main(String[] args) {
            Qno10 obj = new Qno10(100,'c');

            System.out.println( obj.getCelsius());
            System.out.println( obj.getFahrenheit());
            System.out.println( obj.getKelvin());


        }
    }
