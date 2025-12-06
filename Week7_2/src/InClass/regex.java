package InClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String regexPhoneNumber = "^0\\d{9}$"; // bắt đầu là 0 theo sau là 9 kí tự là số từ 0-9
        String regexMail = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Z|a-z]{2,}$"; // bắt đầu là chuỗi bắt kì + @ + chuỗi bất kì + dấu . + bất kì > 2 kí tự
        String regexPassword = "^.{8,}$"; // bắt đầu là bất kì kí tự nào và có ít nhất 8 kí tự
        String regexUsername = "^[a-z]{4,}$"; // tất cẩ là kí tự từ a-z và có ít nhất 4 kí tự

        String phoneNumber = "0355396153";

        Pattern pattern = Pattern.compile(regexPhoneNumber);
        Matcher matcher = pattern.matcher(phoneNumber);

        // (matcher.find())
        if(matcher.matches()) {
            System.out.println("SDT hop le");
        } else {
            System.out.println("SDT khong hop le");
        }


        // Dùng regex xóa khoảng trắng thừa
        String input = "   Hello     moi      nguoi   ";
        String result = input.replaceAll("\\s+", " ").trim();

        System.out.println(input);

    }
}
