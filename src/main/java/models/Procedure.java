package models;

public class Procedure implements Business{
    private Patient patient;
    private Provider provider;
    private String id;

    public Procedure() {}

    public Procedure(String id,String name, int id2, int phonenumber, String email, String name2,int groupID,int memberID,String paymentCard, int amount,String title, int id3, String name3){
        setId(id);
        patient = new Patient(name,id2, phonenumber,email,name2,groupID,memberID, paymentCard, amount);
        provider=new Provider(name3,title,id3);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString(){
        return "Patient: "+patient.toString()+" Provider: "+provider.toString()+" ID: "+getId();
    }
}
