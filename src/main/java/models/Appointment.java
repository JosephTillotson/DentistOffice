package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Appointment implements Business, Serializable {
    /**
     * basic constructer
     */
    public Appointment(){}

    /**
     * overloded constructer
     * @param providers will set the Providers in the Appointement
     * @param procedures is the list of Procedures tat need to happen n the Appointments
     * @param date is the date of the appointment
     */
    public Appointment(ArrayList<Provider> providers, ArrayList<Procedure> procedures, Calendar date, Patient patient){
        this.setProviders(providers);
        this.setProcedures(procedures);
        this.setDate(date);


    }

    private ArrayList<Provider> providers;

    private Calendar date;

    private ArrayList<Procedure> procedures;

    private Patient patient;

    /**
     * will return the list of Providers
     * @return providers Array
     */
    public ArrayList<Provider> getProviders() {
        return providers;
    }

    /**
     * will set the providers array
     * @param providers will set the providers array to lthis array
     */
    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    /**
     * will get teh procedure array
     * @return the procedure array
     */
    public ArrayList<Procedure> getProcedures() {
        return procedures;
    }

    /**
     * will set teh Procedures Array.
     * @param procedures procedures is the array that wil lbe set for the whole Arraylits
     */
    public void setProcedures(ArrayList<Procedure> procedures) {
        this.procedures = procedures;
    }

    /**
     * set the daate
     * @return return the date created
     */
    public Calendar getDate() {

        return date;
    }

    /**
     * will set hte date that the Appointment is set on
     * @param date date that the appointment will be
     */
    public void setDate(Calendar date) {

        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        Appointment p = (Appointment)obj;
        return this.getDate() == p.getDate() && this.getProcedures() == p.getProcedures()
                && this.getProviders() == p.getProviders();
    }

    @Override
    public String toString() {
        return "Appointment Date: " + this.getDate() + ", " + "Appointment Procedures: "
                + this.getProcedures() + ", " + "Appointment Providers: " + this.getProviders();
    }

    /**
     * will get the patient
     * @return the patient that is needed.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * will set the patient
     * @param patient the patient to be
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
