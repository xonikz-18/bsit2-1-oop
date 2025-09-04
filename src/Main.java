public class Main {
    public static void main(String[] args) {
        System.out.println("== Book Record System == \n");
        
        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        System.out.println("Adding books and ratings...");
        try {
            book1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            book1.addMultipleRatings(5, 4, 3, 4);
            System.out.println("Ratings added: 5, 4, 3, 5");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

            book2.addRating(5);
            book2.addMultipleRatings(4, 4, 5, 3);
            book3.addRating(3);
            book3.addMultipleRatings(3, 3, 3, 4);

        try {
            book2.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book highestRatedBook = book1;
        for (Book book : new Book[]{book1, book2, book3}) {
            if (book.getAverageRating() > highestRatedBook.getAverageRating()) {
                highestRatedBook = book;
            }
        }

        System.out.println("Highest rated book: " + highestRatedBook.getTitle() + " by "
                + highestRatedBook.getAuthor() + " (" + highestRatedBook.getAverageRating() + ")");
    }
}
