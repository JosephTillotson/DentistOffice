package models;

import java.io.Serializable;

public class Provider implements Business, Serializable{
    private String name;

    private int id;

    private String title;

    private String lastName;

    /**
     * basic constrctor for Provider
     */
    public Provider(){}

    /**
     * overloaded constructer for Provider
     * @param name name of the provider
     * @param title title of the Provider
     * @param id id of the Provider.
     */
    public Provider(String name, String title, int id, String lastName){
        this.setName(name);
        this.setId(id);
        this.setTitle(title);
        this.setLastName(lastName);
    }

    /**
     * will get the title of the Provider
     * @return will return the title of the Provider
     */
    public String getTitle() {
        return title;
    }

    /**
     * will Set the title of the Provider
     * @param title the title to be set for the provider
     */

    public void setTitle(String title) {
        if (title==null){
            throw new IllegalArgumentException("Title cant ve null");
        }
        this.title = title;
    }

    /**
     * will return the name of the Provider
     * @return return the name of the Provider
     */
    public String getName() {

        return name;
    }

    /**
     * will set the name of the Provider
     * @param name the name of lthe provider to be
     */
    public void setName(String name) {
        if (name==null){
            throw new IllegalArgumentException("name cant be null");
        }
        this.name = name;
    }

    /**
     * will return teh Id of the Provider
     * @return the id of the user
     */
    public int getId() {

        return id;
    }

    /**
     * will set the Id of the user
     * @param id the ID to be
     */
    public void setId(int id) {
        if (id<0){
            throw new IllegalArgumentException("id cant be less then 0");
        }
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Provider p = (Provider)obj;
        return this.getName() == p.getName() &&
                this.getId() == p.getId() &&
                this.getTitle() == p.getTitle();
    }

    @Override
    public String toString() {
        return "Provider Name: " + this.getName() + ", " + "ID: " + this.getId() + ", "
                + "Job Title: " + this.getTitle();
    }

    /**
     * will return the last name of the user
     * @return the last name of the Provider
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * this will set the last name of the  users
     * @param lastName the last name to be.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

