package service;

import com.sun.tools.javac.Main;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CrudImpl implements CrudOperation {
    public static List<User> users = new ArrayList<>();

    @Override
    public boolean createNewUser(User user) {
        users.add(user);
        return true;
    }
}
