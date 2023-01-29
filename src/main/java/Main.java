import model.User;
import service.CrudImpl;

public class Main {
    User user = new User();

    public static void main(String[] args) {

        CrudImpl crud = new CrudImpl();
        crud.createNewUser(new User(1, 11, "123456", "Nikolas", "Nikolas1994"));
        crud.createNewUser(new User(2, 11, "123456", "Nikolase", "Nikolas1994"));
        System.out.println(crud.delUser(2));
        System.out.println(CrudImpl.users);
    }
}
