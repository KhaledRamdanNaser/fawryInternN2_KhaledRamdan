import java.util.ArrayList;

public class BookInventory {
    private ArrayList<Book> books;

    public BookInventory() {
        books = new ArrayList<>();
    }
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void removeBook(int current,int future)
    {
        ArrayList<Book> outdatedBooks=new ArrayList<>();
        for(Book book: books)
        {
            int bookAge=current-book.getYear();
            if (bookAge>future)
            {
                outdatedBooks.add(book);
            }
            System.out.println("Removed outdated book with ISBN: "+book.getISBN());
        }
        books.removeAll(outdatedBooks);
    }
    public void buyBookByISBN(String ISBN,int quantity,String email,String address)
    {
        Book foundBook=null;
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                foundBook = book;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("Book with ISBN " + ISBN + " not found in inventory.");
            return;
        }

        try {
            foundBook.buyBook(quantity, email, address);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void listAllBooks() {
        System.out.println("Current Inventory:");
        for (Book book : books) {
            System.out.println("- " + book.getClass().getSimpleName() + ": " + book.getTitle() + " (ISBN: " + book.getISBN() + ")");
        }
    }

}
