package ariefbelajar.java.validation;

import jakarta.validation.ConstraintViolation;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Set;

public class ConstructorValidatorTest extends AbstractValidatorTest {

    @Test
    void testValidateConstructorParameter() throws NoSuchMethodException {

        String firstName = " ";
        String lastName = " ";
        Address address = null;

        Constructor<Person> constructor = Person.class.getConstructor(String.class, String.class, Address.class);

        Set<ConstraintViolation<Person>> violations = executableValidator
                .validateConstructorParameters(constructor, new Object[]{firstName, lastName, address});

        for (ConstraintViolation<Person> violation : violations) {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
            System.out.println(" ");
        }
    }

    @Test
    void testValidateConstructorReturnValue() throws NoSuchMethodException {

        String firstName = " ";
        String lastName = " ";
        Address address = new Address();

        Person person = new Person(firstName,lastName,address);

        Constructor<Person> constructor = Person.class.getConstructor(String.class, String.class, Address.class);

        Set<ConstraintViolation<Person>> violations = executableValidator
                .validateConstructorReturnValue(constructor,person);

        for (ConstraintViolation<Person> violation : violations) {
            System.out.println(violation.getPropertyPath());
            System.out.println(violation.getMessage());
            System.out.println(" ");
        }
    }


}
