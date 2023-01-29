package service;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CrudImpl implements CrudOperation {
    public static List<User> users = new ArrayList<>();
    public CrudImpl(List<User> users){
        this.users = users;
    }
    public CrudImpl(){}
    @Override
    public boolean createNewUser(User user) {
        users.add(user);
        return true;
    }
    public boolean delUser (int userId) {
        for(int i = 0; i < users.size(); i++){
            User user = users.get(i);
            int userTemporaryId = user.getId();
            if (userTemporaryId == userId){
               users.remove(user);
                return true;
            }
        }
        return false;
    }
}
