package ariefbelajar.java.validation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ContainerDataTest extends AbstractValidatorTest{

    @Test
    void testContainerData() {

        Person person = new Person();
        person.setFirstName("Hilmi");
        person.setLastName("Akbar");
        person.setAddress(new Address());
        person.getAddress().setCity("Kabupaten Bogor");
        person.getAddress().setCountry("Indonesia");
        person.getAddress().setStreet("Tarikolot");

        person.setHobbies(new ArrayList<>());
        person.getHobbies().add("");
        person.getHobbies().add("   ");
        person.getHobbies().add("Gaming");

        validate(person);
    }
}
