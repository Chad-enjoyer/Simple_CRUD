package service;

import model.User;

import java.util.List;

public interface CrudOperation {
    boolean createNewUser(User user);

    boolean deleteUser(int userId);

    User getUserById(int id);

    boolean editUser(User newInfo);

    List<User> getAllUsers();
}
