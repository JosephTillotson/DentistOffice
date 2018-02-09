package models;

public class Provider {
    private String name;

    private int id;

    private String title;

    public Provider(){}
    public Provider(String name, String title, int id){
        this.setName(name);
        this.setId(id);
        this.setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
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
}
