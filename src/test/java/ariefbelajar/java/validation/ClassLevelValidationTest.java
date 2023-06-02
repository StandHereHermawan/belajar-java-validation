package ariefbelajar.java.validation;

import org.junit.jupiter.api.Test;

public class ClassLevelValidationTest extends AbstractValidatorTest {

    @Test
    void testClassLevelConstraintInvalid() {

        Register register = new Register();
        register.setUsername("Hilmi");
        register.setPassword("WTKS2017");
        register.setRetypePassword("WTKS");

        validate(register);

    }

    @Test
    void testClassLevelConstraintValid() {

        Register register = new Register();
        register.setUsername("Hilmi");
        register.setPassword("WTKS2017");
        register.setRetypePassword("WTKS2017");

        validate(register);

    }
}
