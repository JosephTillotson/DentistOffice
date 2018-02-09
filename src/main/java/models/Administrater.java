package models;

public class Administrater extends User{

    private String password;
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
