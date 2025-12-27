package Abstraction_Interface;

    interface Converter<F, T> {
        T convert(F from);
    }

    class CelsiusToFahrenheit implements Converter<Double, Double> {
        public Double convert(Double c){
            return (c * 9/5) + 32;
        }
    }

    class KmToMiles implements Converter<Double, Double> {
        public Double convert(Double km){
            return km * 0.621;
        }
        public static void main(String[] args) {
            Converter<Double, Double> c = new CelsiusToFahrenheit();
            Converter<Double, Double> k = new KmToMiles();

            System.out.println(c.convert(100.0));
            System.out.println(k.convert(5.0));
        }

    }