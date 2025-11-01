import model.DongVat;
import model.User;

public class Main {

    public static void main(String[] args) {
//        DongVat cho = new DongVat("Kitty", 2020, "Xinh", 10);
////        System.out.println(cho.toString());
////        cho.display();

        User[] users = new User[3];
        users[0] = new User("Dieu", 0);
        users[1] = new User("Phuong", 1000);
        users[2] = new User("Anh", 5000);

        double amount = 50;
        Utils.transfer(users[0], users[1], amount);
        Utils.transfer(users[1], users[0], amount);
    }
}