package models;


public class User implements Business{
    private String password;

    private String userName;

    /**
     * overloaded constructer of user
     */
    public User(){}

    /**
     * overloaded constructer of user
     * @param password Password to be of the user
     * @param userName Username of the user
     */
    public User(String password, String userName){
        this.setPassword(password);
        this.setUserName(userName);
    }

    /**
     * will get the users
     * @return will return prompt of the user
     */
    public String getUserName() {
        return userName;
    }

    /**
     * will set the username
     * @param userName will be the username to be
     */

    public void setUserName(String userName) {
        if (userName==null){
            throw new IllegalArgumentException("Username cant be null");
        }
        this.userName = userName;
    }

    /**
     * will get the password of the user
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * will set the password of the user
     * @param password will be the password to be
     */
    public void setPassword(String password) {
        if (password==null){
            throw new IllegalArgumentException("password cant be null");
        }
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
