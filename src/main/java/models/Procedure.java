package models;

public class Procedure implements Business{
    private Patient patient;
    private Provider provider;
    private String id;

    public Procedure() {}

    public Procedure(String id,String name, int id2, int phonenumber, String email, String name2,int groupID,int memberID,String paymentCard, int amount,String title, int id3, String name3){
        setId(id);
        patient = new Patient(name,email, paymentCard,id2,phonenumber,groupID,name2, memberID, amount);
        provider=new Provider(name3,title,id3);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Patient: "+patient.toString()+" Provider: "+provider.toString()+" ID: "+getId();
    }
}
