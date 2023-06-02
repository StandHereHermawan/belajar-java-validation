package ariefbelajar.java.validation.service;

import ariefbelajar.java.validation.constraint.CheckPasswordParameter;
import jakarta.validation.constraints.NotBlank;

public class UserService {

    @CheckPasswordParameter(
            passwordParam = 1,
            retypePasswordParam = 2
    )
    public void register(@NotBlank(message = "username must not blank") String username,
                         @NotBlank(message = "password must not blank") String password,
                         @NotBlank(message = "retype password must not blank") String retypePassword) {
        // TODO Register
    }

}
