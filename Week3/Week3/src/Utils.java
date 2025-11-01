import model.User;

public class Utils {
    public static void transfer(User user_1, User user_2, double amount) {
        if (user_1.withdraw(amount) != -1) {
            System.out.println(user_1.getName() + " chuyển " + amount + " đồng cho " + user_2.getName());
            user_2.deposit(amount);
        }
    }
}
