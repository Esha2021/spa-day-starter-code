package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

public class User {

    @NotBlank(message="Name is  required")
    @Size(min=5,max=15, message="Name must be 5-15characters")
    private String username;

    //@NotBlank(message="Email is required")
    @Email(message="Invalid Try again")
    private String email;

    @NotBlank(message="pwd is required")
    @Size(min=6, message="pwd must be Six character long")
    private String password;
    private int id;
    private int nextId=1;

   @NotNull(message="password do not match")
    private String verifyPassword;


    public User(String username, String email, String password, String verifyPassword, int id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = nextId;
        nextId++;

    }
   public User(){}

    public int getId() {
        return id;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
        checkPassword();

    }
private void checkPassword(){
    if (getPassword() != null && getVerifyPassword() != null && !password.equals(verifyPassword))

    {
          setVerifyPassword(null);
      }
}


}
