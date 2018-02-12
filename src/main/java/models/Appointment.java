package models;

import java.util.ArrayList;
import java.util.Calendar;

public class Appointment implements Business {

    private ArrayList<Provider> providers;

    private Calendar date;

    private ArrayList<Procedure> procedures;

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public ArrayList<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(ArrayList<Procedure> procedures) {
        this.procedures = procedures;
    }

    public Calendar getDate() {

        return date;
    }

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
}
