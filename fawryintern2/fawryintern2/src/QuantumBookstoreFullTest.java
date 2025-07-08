public class QuantumBookstoreFullTest {
    public static void main(String[] args) {

        BookInventory inventory = new BookInventory();
        ShippingService shipping = new HandleShippingService();
        MailService mail = new HandleMailService();

        // add books to inventory
        System.out.println("Quantum book store: Adding books...");
        inventory.addBook(new PaperBook("ISBN001", "Java Basics", 2020, 100.0, "Alice", 5, shipping));
        inventory.addBook(new EBook("ISBN002", "Machine Learning", 2021, 75.0, "Bob", "PDF", mail));
        inventory.addBook(new DemoBook("ISBN003", "Preview Book", 2010, 0.0, "Carol"));
        inventory.addBook(new PaperBook("ISBN004", "Data Structures", 2012, 80.0, "David", 0, shipping));
        // List the books
        inventory.listAllBooks();
        // Valid paperBook Case
        System.out.println("\nQuantum book store: Buying 2 copies of ISBN001");
        inventory.buyBookByISBN("ISBN001", 2, "user@example.com", "Cairo");
        // Valid eBook Case
        System.out.println("\nQuantum book store: Buying 1 copy of ISBN002");
        inventory.buyBookByISBN("ISBN002", 1, "user@example.com", "");
        // buying demo book
        System.out.println("\nQuantum book store: Attempting to buy demo book ISBN003");
        inventory.buyBookByISBN("ISBN003", 1, "user@example.com", "");
        // buying paper book with 0 stock
        System.out.println("\nQuantum book store: Attempting to buy out-of-stock book ISBN004");
        inventory.buyBookByISBN("ISBN004", 1, "user@example.com", "Cairo");
        //  buy non-existent ISBN
        System.out.println("\nQuantum book store: Attempting to buy non-existent book ISBN999");
        inventory.buyBookByISBN("ISBN999", 1, "user@example.com", "Cairo");
        // Remove outdated books more than 10 years
        System.out.println("\nQuantum book store: Removing outdated books...");
        inventory.removeBook(2025, 10);
        // List inventory after removals
        System.out.println("\nQuantum book store: Inventory after removals:");
        inventory.listAllBooks();
    }
}
