package BookManagement.constant;

public class Common {
    public static String MENU = """
            --- Menu ---
            1. Thêm sách
            2. Lấy sách theo ID
            3. Lấy tất cả sách theo thể loại (TextBook/Novel)
            4. Lấy tất cả sách
            5. Xóa sách theo ID
            6. Tổng giá trị thư viện\s
            7. Thoát
            >> Mời chọn chức năng (1-7)""";
    public static String ENTER_TYPE = "Nhập loại sách bạn muốn nhập: ";
    public static String ENTER_TITLE = "Nhập tên sách bạn muốn nhập: ";
    public static String ENTER_AUTHOR = "Nhập tên tác giả: ";
    public static String ENTER_PRICE = "Nhập giá trị: ";
    public static String ENTER_QUANTITY = "Nhập số lượng: ";
    public static String ENTER_SUBJECT = "Nhập tên môn: ";
    public static String ENTER_GENRE = "Nhập thể loại tiểu thuyết: ";

    public static String ENTER_IS_CONTINUE = "Bạn có muốn nhập tiếp không (y/n): ";
    public static String ENTER_ID_TO_FIND = "Nhập id sách muốn tìm: ";

    public static String INFO_BOOK = "Thông tin của sách: ";

    public static String ENTER_FILTER_TYPE = "Nhập loại sách muốn lọc: ";
    public static String ENTER_ID_TO_DELETE = "Nhập id sách muốn xóa: ";

    public static String SHOW_TOTAL_VALUE = "Tổng giá trị của thư viện: %.2f\n";
    public static String SHOW_BOOK_CATEGORY = "\n===DANH SÁCH CÁC CUỐN SÁCH LOẠI %s===";
}
