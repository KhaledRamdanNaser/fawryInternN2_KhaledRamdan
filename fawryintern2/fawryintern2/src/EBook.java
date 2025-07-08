public class EBook extends Book
{
    private String fileType;
    private MailService mailService;

    public EBook(String ISBN, String title, int year, double price, String author, String fileType, MailService mailService) {
        super(ISBN, title, year, price, author);
        this.fileType = fileType;
        this.mailService = mailService;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public MailService getMailService() {
        return mailService;
    }

    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    @Override
    public void buyBook(int quantity, String email, String address) throws Exception {
        double total=quantity*getPrice();
        System.out.println("Purchased EBook, Paid: " + total);
        mailService.sendMail(email);

    }
}
