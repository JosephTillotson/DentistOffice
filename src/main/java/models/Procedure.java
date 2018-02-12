package models;

public class Procedure implements Business{
    private Patient patient;
    private Provider provider;
    private String id;

    /**
     * this is the basic constructor for Procedure
     */
    public Procedure() {}

    /**
     * overloaded constructor for Procedure
     * @param id id of the Procedure
     * @param name of the procedure
     * @param id2 id of the person
     * @param phonenumber of the person
     * @param email of the person
     * @param name2 of the person
     * @param groupID the persons Group Id
     * @param memberID the Persons member ID
     * @param paymentCard Persons paymentcard
     * @param amount Person amount owed
     * @param title title of the provider
     * @param id3 the id of the provider
     * @param name3 name of the provider
     */
    public Procedure(String id,String name, int id2, String phonenumber, String email, String name2,int groupID,int memberID,String paymentCard, int amount,String title, int id3, String name3){
        setId(id);
        patient = new Patient(name,email, paymentCard,id2,phonenumber,groupID,name2, memberID, amount);
        provider=new Provider(name3,title,id3);
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

    @Override
    public String toString(){
        return "Patient: "+patient.toString()+" Provider: "+provider.toString()+" ID: "+this.getId();
    }
}
