package BookManagement.service;

import BookManagement.model.Book;

import java.util.ArrayList;

public interface IBookService {
    public void addBook(Book book);
    public Book getBookById(String id);
    public ArrayList<Book> getAllBooksByCategory(String category);
    public void deleteBookById(String id);
    public ArrayList<Book> getAllBooks();
    public double calculateTotalValue();



}
