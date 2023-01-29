package service;

import model.User;

public interface CrudOperation {
    boolean createNewUser(User user);
    public boolean delUser (int userId);
}
