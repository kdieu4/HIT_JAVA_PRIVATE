package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    public UserService(List<User> users) {
        this.users = users;
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if(user.getId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public void getAllUsers() {
        for(User user : users) {
            System.out.println(user);
        }
    }
}
