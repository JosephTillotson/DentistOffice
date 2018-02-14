package models;

public class Procedure implements Business{
    private Patient patient;
    private Provider provider;
    private String id;
private String name;



    /**
     * this is the basic constructor for Procedure
     */
    public Procedure() {}

    /**
     * overloaded constructor for Procedure
     * @param id id of the Procedure
     * @param name of the procedure
     * @param patient info of Patient Object
     * @param provider info of Provider Object
     */
    public Procedure(String id,String name, Patient patient, Provider provider) {
        this.setId(id);
        this.setName(name);



    }

    /**
     * will return the id of the user
     * @return will get the id of the Procedure and return it
     */
    public String getId() {
        return id;
    }

    /**
     * this will set the ID
     * @param id the id to be
     */
    public void setId(String id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Patient: "+patient.toString()+" Provider: "+provider.toString()+" ID: "+this.getId();
    }
}
