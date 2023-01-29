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

    public CrudImpl() {
    }

    @Override
    public boolean createNewUser(User user) {
        users.add(user);
        return true;
    }

    public boolean delUser(int userId) {
        for (User user : users) {
            int userTemporaryId = user.getId();
            if (userTemporaryId == userId) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }

    public boolean editUser(User newInfo) {
        for (User currentUser : users) {
            int currentUserId = currentUser.getId();
            int userInputId = newInfo.getId();
            if (currentUserId == userInputId) {
                currentUser.setUsername("Andre");
                return true;
            }
        }
        return false;
    }

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
        throw new RuntimeException("There is no same id");
    }
    }