package service.impl;

import constant.SuccessMessage;
import main.Main;
import model.Book;
import service.IBookService;

import java.util.ArrayList;

public class IBookServiceImpl implements IBookService {


    @Override
    public void addBook(Book book) {
        Main.books.add(book);
        System.out.println(SuccessMessage.SUCCESS_ADD_BOOK);
    }

    @Override
    public Book getBookById(String id) {
        for(Book book : Main.books){
            if(book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooksByCategory(String category) {
        return null;
    }

    @Override
    public Book deleteBookById(String id) {
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return Main.books;
    }

    @Override
    public double calculateTotalValue() {
        return 0;
    }
}
