package ariefbelajar.java.validation;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Person {

    private List<@NotBlank(message = "hobby must not blank") String> hobbies;

    @Size(max = 20, message = "first name length max must 20 characters")
    @NotBlank(message = "first name must not blank")
    private String firstName;


    @Size(max = 20, message = "last name length max must 20 characters")
    @NotBlank(message = "last name must not blank")
    private String lastName;

    @NotNull(message = "address must not null")
    @Valid
    private Address address;

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Valid
    public Person() {
    }

    @Valid
    public Person(
            @NotBlank(message = "first name must not blank") String firstName,
            @NotBlank(message = "last name must not blank") String lastName,
            @NotNull(message = "address must not null") @Valid Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void sayHello(@NotBlank(message = "name must not blank") String name) {
        System.out.println("Hello " + name + ", my name is " + firstName);
    }

    @NotBlank(message = "full name must not blank")
    public String fullName() {
        return firstName + " " + lastName;
    }

}
