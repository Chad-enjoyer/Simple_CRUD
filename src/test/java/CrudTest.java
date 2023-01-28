import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.CrudImpl;
import service.CrudOperation;

public class CrudTest {
    @Test
    public void test() {
        CrudOperation crud = new CrudImpl();
        Assertions.assertTrue(crud.createNewUser(null));
    }
}
