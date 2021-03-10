package edu.eci.ieti.taskplanner.model;

public class User {

    private String id;
    private String fullname;
    private String email;
    private String password;
    

    public User(String userId, String fullname, String email, String password) {
        this.id = userId;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }
    
    public String getId() {
        return this.id;
    }

    public void setId(String userId) {
        this.id = userId;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    @Override
    public String toString() {
        return "{" +
            " userId='" + getId() + "'" +
            ", fullname='" + getFullname() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }


}