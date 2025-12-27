package Encapsulation;

public class Qno6 {

        // Private fields
        private String title;
        private String author;
        private String isbn;
        private int pages;
        private boolean isAvailable;

        // Constructor
        public Qno6(String title, String author, String isbn, int pages) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;       // ISBN cannot change later
            this.pages = pages;
            this.isAvailable = true; //in starting Book as available
        }

        // Getter methods
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        public int getPages() {
            return pages;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        // Method to borrow book
        public boolean borrowBook() { // yani book kharide ke liye
            if (isAvailable==true) { // if book available hoga toh
                isAvailable = false;  // Change kr do ki Available nhi hai

                return true; // Successfully borrowed
            }
            else {
                return false;} // Borrow failed
        }

        // Method to return book
        public boolean returnBook() {
            if (isAvailable==false) { // agr availlable nhi hai toh
                isAvailable = true;  // change kr do ki ab avialable hai

                return true; // Successfully returned
            }
            else {
                return false;}// Already available
        }

        // Method to get formatted book info
        public String getBookInfo() {
            return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nPages: " + pages + "\nAvailable: " + isAvailable;
        }

    }
class main{
    public static void main(String[] args) {
        Qno6 obj = new Qno6("jungle book","PRince kumar ","154568558895",185);

        System.out.println("book is present in Library and i got a BOok :- "+obj.borrowBook());
        System.out.println("book is present in Library and i got a BOok :- "+obj.borrowBook());

        System.out.println("ABout Book COmplete Information is :-\n"+obj.getBookInfo());

        System.out.println("I am Returning a book in Library "+ obj.returnBook());

        System.out.println("ABout Book COmplete Information is :-\n"+obj.getBookInfo());
    }
}
