package service;

import constant.Message;
import model.User;

import java.util.List;

public class AuthService {

    private final List<User> users;

    public AuthService(List<User> users) {
        this.users = users;
    }

    public User login(String username, String password) {
        for (User user : users) {
//            System.out.println(user);
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void register(String username, String password, String email, String phoneNumber) {
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            System.out.println(Message.MISS_DATA);
            return;
        }
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println(Message.EXISTED_USERNAME);
                return;
            }
        }
        users.add(new User(username, password, email, phoneNumber));
        System.out.println(Message.REGISTER_SUCCESS);
    }

    public void changePassword(String userId, String newPassword, String confirmNewPassword) {
//        System.out.println("user id : " + userId);
        if(!newPassword.equals(confirmNewPassword)) {
            System.out.println(Message.NOT_MATCH_PASSWORD);
            return;
        }
        for (User user : users) {
            System.out.println(user.getId());
            if(user.getId().equals(userId)) {
//                System.out.println(user.getPassword());
                user.setPassword(newPassword);
//                System.out.println(user.getPassword());
                System.out.println(Message.SUCCESS_CHANGE_PASSWORD);
                return;
            }
        }
    }
}
