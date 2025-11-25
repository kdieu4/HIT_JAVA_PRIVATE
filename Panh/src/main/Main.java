package main;

import model.Book;
import model.Novel;
import model.TextBook;
import service.impl.IBookServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        books.add(new TextBook("anh", "dieu", 23.00, 21, "toan"));
        books.add(new Novel("kho do danh", "panh", 24.000, 28, "ngon tinh"));
        int choice = sc.nextInt();
        IBookServiceImpl bookService = new IBookServiceImpl();
        switch (choice) {
            case 1:
                System.out.println("tieu thuyet hay mon hoc ");
                sc.nextLine();
                String chon = sc.nextLine();
                switch (chon) {
                    case "tieu thuyet":
                        Novel newNovel = new Novel();
                        System.out.println("TEN");
                        newNovel.setTitle(sc.nextLine());
                        System.out.println("tac gia");
                        newNovel.setAuthor(sc.nextLine());
                        System.out.println("gia tien");
                        newNovel.setPrice(sc.nextDouble());
                        sc.nextLine();
                        System.out.println("so luong");
                        newNovel.setQuantity(sc.nextInt());
                        sc.nextLine();
                        System.out.println("the loai");
                        newNovel.setGenre(sc.nextLine());
                        bookService.addBook(newNovel);
                        break;
                }
            case 2:
//                System.out.println(bookService.getAllBooks());

                for (Book book : books) {
                    book.displayInfo();
                }
//                books.forEach(Book::displayInfo);
                break;
            case 3:
                System.out.println("nhap id:");
                String id = sc.nextLine();
                sc.nextLine();
                System.out.println(bookService.getBookById(id));
                break;
        }
        System.out.println("nhap id:");
        String id = sc.nextLine();
        sc.nextLine();
        System.out.println(bookService.getBookById(id));
    }

}
