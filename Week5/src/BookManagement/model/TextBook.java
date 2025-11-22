package BookManagement.model;

public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook(String title, String author, double price, int quantity, String subject) {
        super(title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Môn học: " + subject + "\n");
    }


    @Override
    public boolean borrow(int quantity) {
        return false;
    }

    @Override
    public int getAvailableQuantity() {
        return 0;
    }
}
