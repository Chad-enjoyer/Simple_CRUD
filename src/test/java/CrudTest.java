import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CrudImpl;
import service.CrudOperation;

import java.util.ArrayList;
import java.util.List;

public class CrudTest {
        @Test
        public void createUserTest() {
            List<User> list = new ArrayList<>();
            CrudOperation crud = new CrudImpl(list);
            Assertions.assertTrue(crud.createNewUser(null));
        }
        @Test
            public void deleteUserTest() {
            List<User> list = new ArrayList<>();
            CrudOperation crud = new CrudImpl(list);
            crud.createNewUser(new User(1, 11, "123456", "Nikolas", "Nikolas1994"));
            crud.createNewUser(new User(2, 11, "123456", "Nikolase", "Nikolas1994"));
            Assertions.assertFalse(crud.delUser(10));
            Assertions.assertTrue(crud.delUser(1));
            Assertions.assertFalse(list.contains(new User(1, 11, "123456", "Nikolas", "Nikolas1994")));
            Assertions.assertTrue(list.contains(new User(2, 11, "123456", "Nikolase", "Nikolas1994")));
        }
    }

