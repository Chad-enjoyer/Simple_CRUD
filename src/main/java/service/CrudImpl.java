package service;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CrudImpl implements CrudOperation {
    public static List<User> users = new ArrayList<>();

    public CrudImpl(List<User> users) {
        CrudImpl.users = users;
    }

    @Override
    public boolean createNewUser(User user) {
        users.add(user);
        return users.contains(user);
    }

    @Override
    public boolean deleteUser(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                users.remove(user);
                return !users.contains(user);
            }
        }
        return false;
    }

    @Override
    public boolean editUser(User newInfo) {
        for (User currentUser : users) {
            if (currentUser.getId() == newInfo.getId()) {
                currentUser.setUsername(newInfo.getUsername());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return CrudImpl.users;
    }

    public User getUserById(int id) {
        for (User user : users) {
            int temporaryId = user.getId();
            if (temporaryId == id) {
                return user;
            }
        }
        throw new RuntimeException("Specified ID not found");
    }
}