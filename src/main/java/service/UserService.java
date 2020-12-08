package service;

import db.DataBase;
import model.User;
import model.Users;

import java.util.ArrayList;

public class UserService {
    public void addUser(User user) {
        DataBase.addUser(user);
    }

    public boolean loginProcess(String userId, String password) {
        User user = DataBase.findUserById(userId);
        return user != null && user.getPassword().equals(password);
    }

    public Users findAll(){
        return new Users(new ArrayList<>(DataBase.findAll()));
    }
}
