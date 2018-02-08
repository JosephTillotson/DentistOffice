package models;

public class User {
    private String password;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "Username: "+getUserName()+" Password: "+getPassword();
    }

    @Override
    public boolean equals(Object obj){
        User other=(User)obj;
        return this.getPassword().equals(other.getPassword())&&this.getUserName().equals(other.getUserName());
    }
}
