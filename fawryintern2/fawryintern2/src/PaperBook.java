public class PaperBook extends Book{//start class

    private int stock;
    private ShippingService shippingService;
    public PaperBook(String ISBN, String title, int year, double price, String author, int stock,ShippingService shippingService) {
        super(ISBN, title, year, price, author);
        this.stock = stock;
        this.shippingService = shippingService;

    }

    @Override
    public void buyBook(int quantity, String email, String address) throws Exception
    { // start of buyBook Method
        if(stock<quantity){
            throw new Exception("No Enough stock for book with ISBN "+getISBN());
        }
        stock=stock-quantity;
        double total=quantity*getPrice();
        System.out.println("Successfully bought paperBook with ISBN : "+getISBN());
        shippingService.sendShipping(address);
    }// end of buyBook method

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}// end of class
