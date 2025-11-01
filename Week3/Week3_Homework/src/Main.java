import constant.Menu;
import constant.Message;
import model.User;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        users.add(new User("a", "b", "HoangThanhDieu2006@gmail.com", "0964560712"));
        users.add(new User("phuonganh", "dvvdd", "DangPhuongAnh1506@gmail.com", "0946206280"));
        users.add(new User("giahuy", "dffesv", "DaoGiaHuy1005@gmail.com", "0976365470"));
        users.add(new User("quynhtrang", "trangcute", "TrangQuynhTa2308@gmail.com", "0397587652"));
        users.add(new User("ngocha", "haxinhgai", "NguyenNgocHa1508@gmail.com", "0958601885"));

        AuthService authService = new AuthService(users);
        UserService userService = new UserService(users);

//        for (User user : users) {
//            System.out.println(user);
//        }

        User currentUser = null;
        while (true) {
            if (currentUser == null) {
                System.out.println(Menu.MENU_AUTH);
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print(Menu.ENTER_USERNAME);
                        sc.nextLine();
                        String username = sc.nextLine();
                        System.out.print(Menu.ENTER_PASSWORD);
                        String password = sc.nextLine();

                        currentUser = authService.login(username, password);
                        if (currentUser == null) {
                            System.out.print(Message.INVALID_ACCOUNT);
                        } else {
                            System.out.println(Message.LOGIN_SUCCESS);
                        }
                        break;
                    case 2:
                        System.out.print(Menu.ENTER_USERNAME);
                        sc.nextLine();
                        String u = sc.nextLine();
                        System.out.print(Menu.ENTER_PASSWORD);
                        String p = sc.nextLine();
                        System.out.print(Menu.ENTER_EMAIL);
                        String e = sc.nextLine();
                        System.out.print(Menu.ENTER_PHONENUMBER);
                        String ph = sc.nextLine();
                        authService.register(u, p, e, ph);
                        break;
                    case 3:
                        System.out.print(Message.EXIT);
                        return;
                    default:
                        System.out.print(Message.INVALID_CHOICE);
                }
            } else {
                System.out.println(Menu.MENU_USER);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(Menu.ENTER_ID);
                        sc.nextLine();
                        String id = sc.nextLine();
                        User found = userService.getUserById(id);
                        if (found == null) {
                            System.out.print(Message.INVALID_ID);
                        } else {
                            System.out.println(found);
                        }
                        break;
                    case 2:
                        System.out.println(Menu.USERS_LIST);
                        userService.getAllUsers();
                        break;
                    case 3:
                        System.out.println(Menu.ENTER_NEW_PASSWORD);
                        sc.nextLine();
                        String newPassword = sc.nextLine();
                        System.out.println(Menu.CONFIRM_NEW_PASSWORD);
                        String confirmNewPassword = sc.nextLine();
//                        System.out.println(currentUser.getId());
                        authService.changePassword(currentUser.getId(), newPassword, confirmNewPassword);

                        break;
                    case 4:
                        currentUser = null;
                        System.out.println(Message.LOGOUT_SUCCESS);
                        break;
                    default:
                        System.out.print(Message.INVALID_CHOICE);
                        return;
                }
            }
        }
    }
}