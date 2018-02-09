package models;

public class Procedure {
    private Patient patient;
    private Provider provider;
    private String id;

    public Procedure() {}

    public Procedure(Patient patient, Provider provider, String id){
        setId(id);
        setPatient(patient);
        setProvider(provider);
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
}
