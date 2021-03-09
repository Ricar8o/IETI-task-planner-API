package edu.eci.ieti.taskplanner.model;

public class User {
    
    private String password;
    private String fullname;
    private String email;
    private String userId;
    
    public User(String password, String fullname, String email, String userId) {
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return this.userId;
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "{" +
            " password='" + getPassword() + "'" +
            ", fullname='" + getFullname() + "'" +
            ", email='" + getEmail() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }

}