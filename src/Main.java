public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Accel World, Vol. 1 : Kuroyukihime Return", "Reki Kawahara", 232);
        Book book2 = new Book("Komi Cant Communicate, Vol. 1", "Tomohito Oda", 192);
        Book book3 = new Book("Death Note Black Edition, Vol. 1", "Tsugumi Ohba", 400);

        System.out.println();
        book1.displayInfo();
        System.out.println();
        book1.borrowBook();
        book1.displayInfo();
        System.out.println();
        book1.returnBook();
        book1.displayInfo();
        System.out.println();

        System.out.println();
        book2.displayInfo();
        System.out.println();
        book2.borrowBook();
        book2.displayInfo();
        System.out.println();
        book2.returnBook();
        book2.displayInfo();
        System.out.println();

        System.out.println();
        book3.displayInfo();
        System.out.println();
        book3.borrowBook();
        book3.displayInfo();
        System.out.println();
        book3.returnBook();
        book3.displayInfo();
        System.out.println();
    }
}

class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable = true;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    void borrowBook() {
        isAvailable = false;
        System.out.println("You have borrowed '" + title + "'.");
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("You have returned '" + title + "'.");
    }
}
