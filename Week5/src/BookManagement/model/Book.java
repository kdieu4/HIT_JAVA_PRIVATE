package BookManagement.model;

import BookManagement.service.Borrowable;

import java.util.UUID;

public abstract class Book implements Borrowable {
    private String id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(String title, String author, double price, int quantity) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void displayInfo() {
        System.out.println(
                "\nId: " + id +
                        "\nTiêu đề: " + title + "\nTác giả: " + author + "\nGiá bán: " + price + "\nSố lượng: " + quantity);
    }
}
