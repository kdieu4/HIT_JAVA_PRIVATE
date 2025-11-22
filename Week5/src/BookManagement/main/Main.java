package BookManagement.main;

import BookManagement.constant.Common;
import BookManagement.constant.ErrorMessage;
import BookManagement.constant.SuccessMessage;
import BookManagement.exception.InvalidBookException;
import BookManagement.model.Book;
import BookManagement.model.Novel;
import BookManagement.model.TextBook;
import BookManagement.service.impl.IBookServiceImpl;

import java.util.*;

/*
Hàm calculateTotalValue là tính toán tổng giá trị của thư viện (số lượng sách * giá thuê)
Hàm getAllBooksByCategory() là lấy ra tất cả các quyển sách có thể loại là TextBook hoặc Novel (gợi ý sử dụng instanceof)
Hiển thị menu:
--- Menu ---
1. Thêm sách
2. Lấy sách theo ID
3. Lấy tất cả sách theo thể loại (TextBook/Novel)
4. Lấy tất cả sách
5. Xóa sách theo ID
6. Tổng giá trị thư viện
*/

public class Main {
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<String> typeOfBook = new ArrayList<>();

    static abstract class Action {
        abstract public void run(String... args);
    }

    public static void main(String[] args) {
        typeOfBook.add("textbook");
        typeOfBook.add("novel");
        books.add(new TextBook("Giải tích", "Nguyễn Văn An", 25500, 500, "Toán"));
        books.add(new TextBook("Đại số tuyến tính", "Trần Ngọc Bình", 22500, 500, "Toán"));
        books.add(new Novel("Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 50000, 200, "Học đường"));
        books.add(new Novel("Chiếc thuyền ngoài xa", "Nguyễn Minh Châu", 55000, 250, "Tâm lý, hiện thực"));

        IBookServiceImpl bookService = new IBookServiceImpl();

        Scanner scanner = new Scanner(System.in);
        Map<String, Action> bookMap = getStringActionMap(scanner, bookService);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println(Common.MENU);
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(ErrorMessage.ERROR_INVALID_CHOICE);
                continue;
            }
            switch (choice) {
                case 1:
                    boolean isAddBookContinue = true;
                    while (isAddBookContinue) {
                        typeOfBook.forEach(System.out::println);
                        System.out.println(Common.ENTER_TYPE);
                        String type = scanner.nextLine();
                        boolean found = false;
                        for (String bookType : typeOfBook) {
                            if (bookType.contains(type)) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println(ErrorMessage.ERROR_FIND_TYPE);
                            continue;
                        }

//                        String title, author;
//                        String price;
//                        String quantity;
//                        try {
//                            System.out.println(Common.ENTER_TITLE);
//                            title = scanner.nextLine();
//                            System.out.println(Common.ENTER_AUTHOR);
//                            author = scanner.nextLine();
//                            System.out.println(Common.ENTER_PRICE);
//                            price = scanner.nextLine();
//                            System.out.println(Common.ENTER_QUANTITY);
//                            quantity = scanner.nextLine();
//                        } catch (NumberFormatException e) {
//                            System.out.println(ErrorMessage.ERROR_INVALID_BOOK_INFO);
//                            break;
//                        }

//                        bookMap.get(type).run(title, author, price, quantity);

                        String title, author;
                        double price;
                        int quantity;
                        try {
                            System.out.println(Common.ENTER_TITLE);
                            title = scanner.nextLine();
                            System.out.println(Common.ENTER_AUTHOR);
                            author = scanner.nextLine();
                            System.out.println(Common.ENTER_PRICE);
                            price = Double.parseDouble(scanner.nextLine());
                            System.out.println(Common.ENTER_QUANTITY);
                            quantity = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(ErrorMessage.ERROR_INVALID_BOOK_INFO);
                            break;
                        }
                        switch (type) {
                            case "textbook":
                                System.out.println(Common.ENTER_SUBJECT);
                                String subject = scanner.nextLine();

                                TextBook newTextBook = new TextBook(title, author, price, quantity, subject);
                                try {
                                    bookService.addBook(newTextBook);
                                    System.out.println(SuccessMessage.SUCCESS_ADD_BOOK);
                                } catch (InvalidBookException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case "novel":
                                System.out.println(Common.ENTER_GENRE);
                                String genre = scanner.nextLine();

                                Novel newNovel = new Novel(title, author, price, quantity, genre);
                                try {
                                    bookService.addBook(newNovel);
                                    System.out.println(SuccessMessage.SUCCESS_ADD_BOOK);
                                } catch (InvalidBookException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            default:
                                System.out.println(ErrorMessage.ERROR_FIND_TYPE);
                        }
                        System.out.println(Common.ENTER_IS_CONTINUE);
                        String ans = scanner.nextLine();
                        System.out.println(ans);
                        if (!ans.equalsIgnoreCase("Y")) {
                            isAddBookContinue = false;
                        }
                    }
                    break;
                case 2:
                    System.out.println(Common.ENTER_ID_TO_FIND);
                    String id = scanner.nextLine();
                    Book foundedBook = bookService.getBookById(id);
                    if (foundedBook == null) {
                        System.out.printf(ErrorMessage.ERROR_ID_NOT_FOUND, id);
                    } else {
                        System.out.println(SuccessMessage.SUCCESS_FOUND_BOOK);
                        System.out.println(Common.INFO_BOOK);
                        foundedBook.displayInfo();
                    }
                    break;
                case 3:
                    System.out.println(Common.ENTER_FILTER_TYPE);
                    String filterType = scanner.nextLine();
                    ArrayList<Book> res = bookService.getAllBooksByCategory(filterType);
                    System.out.printf(Common.SHOW_BOOK_CATEGORY, filterType.toUpperCase());
                    res.forEach(Book::displayInfo);
                    break;
                case 4:
                    books.forEach(Book::displayInfo);
                    break;
                case 5:
                    System.out.println(Common.ENTER_ID_TO_DELETE);
                    String idToDelete = scanner.nextLine();
                    bookService.deleteBookById(idToDelete);
                    books.forEach(Book::displayInfo);
                    break;
//                6. Tổng giá trị thư viện
                case 6:
                    System.out.printf(Common.SHOW_TOTAL_VALUE, bookService.calculateTotalValue());
                    break;
                case 7:
                    isContinue = false;
                    break;
                default:
                    System.out.println(ErrorMessage.ERROR_INVALID_CHOICE);
                    break;
            }
        }

    }

    private static Map<String, Action> getStringActionMap(Scanner scanner, IBookServiceImpl bookService) {
        Map<String, Action> bookMap = new HashMap<>();
        bookMap.put("textbook", new Action() {
            @Override
            public void run(String... args) {
                System.out.println(Common.ENTER_SUBJECT);
                String subject = scanner.nextLine();

                TextBook newTextBook = new TextBook(args[0], args[1], Double.parseDouble(args[2]), Integer.parseInt(args[3]), subject);
                try {
                    bookService.addBook(newTextBook);
                    System.out.println(SuccessMessage.SUCCESS_ADD_BOOK);
                } catch (InvalidBookException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        bookMap.put("novel", new Action() {
            @Override
            public void run(String... args) {
                System.out.println(Common.ENTER_GENRE);
                String genre = scanner.nextLine();

                Novel newNovel = new Novel(args[0], args[1], Double.parseDouble(args[2]), Integer.parseInt(args[3]), genre);
                try {
                    bookService.addBook(newNovel);
                    System.out.println(SuccessMessage.SUCCESS_ADD_BOOK);
                } catch (InvalidBookException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        return bookMap;
    }
}
