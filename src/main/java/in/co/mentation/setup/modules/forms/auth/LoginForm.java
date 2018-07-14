package in.co.mentation.setup.modules.forms.auth;

import javax.validation.constraints.NotEmpty;

public class LoginForm {
    @NotEmpty(message = "Please enter a valid username")
    public String username;

    @NotEmpty(message = "Please enter your password")
    public String password;

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
}
