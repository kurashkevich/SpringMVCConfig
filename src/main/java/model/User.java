package model;

import javax.validation.constraints.Size;


public class User {


    private String email;

    @Size(min = 5, message = "Пароль должен быть минимум 5 символов")
    private String pass;

    public User() {
    }

    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
