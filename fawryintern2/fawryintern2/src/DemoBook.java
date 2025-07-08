public class DemoBook extends Book
{
    public DemoBook(String ISBN, String title, int year, double price, String author) {
        super(ISBN, title, year, price, author);
    }

    @Override
    public void buyBook(int quantity, String email, String address) throws Exception {
        throw new Exception("Demo book is not for sale.");
    }

}
