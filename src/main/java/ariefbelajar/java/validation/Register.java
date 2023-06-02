package ariefbelajar.java.validation;

import ariefbelajar.java.validation.constraint.CheckPassword;
import jakarta.validation.constraints.NotBlank;

@CheckPassword(message = "password and retype password must equal")
public class Register {

    @NotBlank(message = "username must not blank")
    private String username;

    @NotBlank(message = "password must not blank")
    private String password;

    @NotBlank(message = "retype password must not blank")
    private String retypePassword;

    @Override
    public String toString() {
        return "Register{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", retypePassword='" + retypePassword + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }
}
