package controller;


import models.*;

import java.util.ArrayList;
import java.util.Calendar;

public class Search {
    private ArrayList<User> returnedUsers;

    private ArrayList<Provider> returnedProviders;

    private ArrayList<Patient> returnedPatients;

    private ArrayList<Appointment> returnedAppointments;

    public Business searchAmount(int min, int max){

    }
    public ArrayList<User> searchUser(ArrayList<User> users,String firstname){
        returnedUsers=new ArrayList<User>();
        for (int i = 0; i<users.size();i++){
            if (users.get(i).getFirstName().equals(firstname)){
                returnedUsers.add(users.get(i));
            }
        }
        return returnedUsers;
    }
    public ArrayList<User> searchUser(ArrayList<User> users, String firstname, String lastName){
        returnedUsers=new ArrayList<User>();
        for (int i = 0; i<users.size();i++){
            if (users.get(i).getFirstName().equals(firstname)){
                if (users.get(i).getLastName().equals(lastName)) {
                    returnedUsers.add(users.get(i));
                }
            }
        }
        return returnedUsers;
    }
    public ArrayList<User> searchUser(ArrayList<User> users, String firstName, String lastName,String userName){
        returnedUsers=new ArrayList<User>();
        for (int i = 0; i<users.size();i++){
            if (users.get(i).getFirstName().equals(firstName)){
                if (users.get(i).getLastName().equals(lastName)) {
                    if (users.get(i).getUserName().equals(lastName)) {
                        returnedUsers.add(users.get(i));
                    }
                }
            }
        }
        return returnedUsers;
    }
    public ArrayList<Provider> searchProvider(ArrayList<Provider> providers, String firstName){
     returnedProviders=new ArrayList<Provider>();
     for (int i = 0;i<providers.size();i++){
         if (providers.get(i).getName().contains(firstName)){
             returnedProviders.add(providers.get(i));
         }
     }
     return returnedProviders;
    }
    public ArrayList<Provider> searchProvider(ArrayList<Provider> providers,String firstName, String lastName){
        returnedProviders=new ArrayList<Provider>();
        for (int i = 0;i<providers.size();i++){
            if (providers.get(i).getName().contains(firstName)){
                if (providers.get(i).getLastName().contains(lastName)) {
                    returnedProviders.add(providers.get(i));
                }
            }
        }
        return returnedProviders;
    }
    public ArrayList<Provider> searchProvider(ArrayList<Provider> providers,String firstName, String lastName, String title){
        returnedProviders=new ArrayList<Provider>();
        for (int i = 0;i<providers.size();i++){
            if (providers.get(i).getName().contains(firstName)){
                if (providers.get(i).getLastName().contains(lastName)) {
                    if (providers.get(i).getTitle().contains(title)) {
                        returnedProviders.add(providers.get(i));
                    }
                }
            }
        }
        return returnedProviders;
    }
    public ArrayList<Patient> searchPatient(ArrayList<Patient> patients, String firstName){
        returnedPatients=new ArrayList<Patient>();
        for (int i = 0; i<patients.size(); i++){
            if (patients.get(i).getName().contains(firstName)){
                returnedPatients.add(patients.get(i));
            }
        }
        return returnedPatients;
    }
    public ArrayList<Patient> searchPatient(ArrayList<Patient> patients,String firstName,String lastName){
        returnedPatients=new ArrayList<Patient>();
        for (int i = 0; i<patients.size(); i++){
            if (patients.get(i).getName().contains(firstName)){
                if (patients.get(i).getLastName().contains(lastName)){
                    returnedPatients.add(patients.get(i));
                }
            }
        }
        return returnedPatients;
    }
    public ArrayList<Patient> searchPatient(ArrayList<Patient> patients,String firstName, String lastName, String insuranceName){
        returnedPatients=new ArrayList<Patient>();
        for (int i = 0; i<patients.size(); i++){
            if (patients.get(i).getName().contains(firstName)){
                if (patients.get(i).getLastName().contains(lastName)){
                    if (patients.get(i).getIname().contains(insuranceName)) {
                        returnedPatients.add(patients.get(i));
                    }
                }
            }
        }
        return returnedPatients;
    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments, Calendar StartTime, Calendar endTime){

    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments,Calendar StartTime, Calendar endTime,Provider provider){

    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments,Calendar StartTime, Calendar endTime,Provider provider, Patient patient){

    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments,Calendar StartTime, Calendar endTime,Provider provider, Patient patient, String code){

    }

}
