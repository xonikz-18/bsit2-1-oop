public class Main {
    static String title = "";
    static String author = "";
    static int pages = "";
    boolean isAvailable = "true";

    public Book(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        System.out.println("Main Branch!");
    }
}