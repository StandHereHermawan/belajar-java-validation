package ariefbelajar.java.validation;

import ariefbelajar.java.validation.service.UserService;
import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Set;

public class CrossValidationTest extends AbstractValidatorTest{

    @Test
    void testCrossParameter() throws NoSuchMethodException {

        UserService userService = new UserService();

        Method method = UserService.class.getMethod("register", String.class, String.class, String.class);
        String username = "Hilmi";
        String password = "02Pink";
        String retypePassword = "Pink";

        Set<ConstraintViolation<UserService>> violations = executableValidator
                .validateParameters(userService, method, new Object[]{
                username, password, retypePassword
        });

        for (ConstraintViolation<UserService> violation : violations) {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
        }

    }

    @Test
    void testCrossParameterValid() throws NoSuchMethodException {

        UserService userService = new UserService();

        Method method = UserService.class.getMethod("register", String.class, String.class, String.class);
        String username = "Hilmi";
        String password = "02Pink";
        String retypePassword = "02Pink";

        Set<ConstraintViolation<UserService>> violations = executableValidator
                .validateParameters(userService, method, new Object[]{
                        username, password, retypePassword
                });

        for (ConstraintViolation<UserService> violation : violations) {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
        }

    }
}
