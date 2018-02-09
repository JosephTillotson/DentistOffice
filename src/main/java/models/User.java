package models;


public class User implements Business{
    private String password;

    private String userName;

    public User(){}
    public User(String password, String userName){
        this.setPassword(password);
        this.setUserName(userName);
    }

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
