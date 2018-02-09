package models;

public class Administrater extends User implements Business{

    private String password;
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
