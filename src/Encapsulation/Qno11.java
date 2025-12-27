package Encapsulation;

public class Qno11 {



        // -------- Private Fields --------
        private String title;
        private String director;
        private int year;
        private double rating;
        private boolean isRented;

        // -------- Constructor --------
        public Qno11(String title, String director, int year, double rating) {
            this.title = title;
           this.director = director;
            this.year = year;
            this.rating = rating;
            this.isRented = false;   // not rented initially
        }

        // -------- Getter Methods --------
        public String getTitle() {
            return title;
        }

        public String getDirector() {
            return director;
        }

        public int getYear() {
            return year;
        }

        public double getRating() {
            return rating;
        }

        // -------- Movie Rent Method --------
        public void rentMovie() {
            if (isRented == false) {     // Movie available
                isRented = true;
                System.out.println("Movie rented successfully!");
            } else {                     // Already rented
                System.out.println("Movie is already rented!");
            }
        }

        // -------- Movie Return Method --------
        public void returnMovie() {
            if (isRented == true) {      // If rented, return it
                isRented = false;
                System.out.println("Movie returned successfully!");
            } else {
                System.out.println("Movie was not rented!");
            }
        }

        // -------- Set Rating (Validate 1.0 - 10.0) --------
        public void setRating(double r) {
            if (r >= 1.0 && r <= 10.0) {
                rating = r;
                System.out.println("Rating updated!");
            } else {
                System.out.println("Invalid rating! Rating must be between 1.0 and 10.0.");
            }
        }

        // -------- Get Movie Status --------
        public String getMovieStatus() {
            if (isRented == true)
                return "Not Availlable ";
            else
                return "Available";
        }
    }

    class MovieRental_System{
        public static void main(String[] args) {

            Qno11 obj = new Qno11("abcd","xyz",2001,5);
            System.out.println(obj.getMovieStatus());
            System.out.println(obj.getRating());

            obj.rentMovie();

            System.out.println(obj.getMovieStatus());

            obj.rentMovie();
            obj.returnMovie();
            obj.returnMovie();

            System.out.println(obj.getMovieStatus());

            obj.setRating(8.5);

            System.out.println(obj.getRating());

        }


    }