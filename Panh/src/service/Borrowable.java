package service;

public interface Borrowable {
    public boolean borrow(int quantity);

    public int getAvailableQuantity();
}
