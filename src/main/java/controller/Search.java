package controller;


import models.*;

import java.util.ArrayList;
import java.util.Calendar;

public class Search {
    private ArrayList<User> returnedUsers;

    private ArrayList<Provider> returnedProviders;

    private ArrayList<Patient> returnedPatients;

    private ArrayList<Appointment> returnedAppointments;


    public ArrayList<User> searchUser(ArrayList<User> users,String firstname){
        returnedUsers=new ArrayList<>();
        for (int i = 0; i<users.size();i++){
            if (users.get(i).getFirstName().equals(firstname)){
                returnedUsers.add(users.get(i));
            }
        }
        return returnedUsers;
    }
    public ArrayList<User> searchUser(ArrayList<User> users, String firstname, String lastName){
        returnedUsers=new ArrayList<>();
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
        returnedUsers=new ArrayList<>();
        for (int i = 0; i<users.size();i++){
            if (users.get(i).getFirstName().equals(firstName)){
                if (users.get(i).getLastName().equals(lastName)) {
                    if (users.get(i).getUserName().equals(userName)) {
                        returnedUsers.add(users.get(i));
                    }
                }
            }
        }
        return returnedUsers;
    }
    public ArrayList<Provider> searchProvider(ArrayList<Provider> providers, String firstName){
     returnedProviders=new ArrayList<>();
     for (int i = 0;i<providers.size();i++){
         if (providers.get(i).getName().contains(firstName)){
             returnedProviders.add(providers.get(i));
         }
     }
     return returnedProviders;
    }
    public ArrayList<Provider> searchProvider(ArrayList<Provider> providers,String firstName, String lastName){
        returnedProviders=new ArrayList<>();
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
        returnedProviders=new ArrayList<>();
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
        returnedPatients=new ArrayList<>();
        for (int i = 0; i<patients.size(); i++){
            if (patients.get(i).getName().contains(firstName)){
                returnedPatients.add(patients.get(i));
            }
        }
        return returnedPatients;
    }
    public ArrayList<Patient> searchPatient(ArrayList<Patient> patients,String firstName,String lastName){
        returnedPatients=new ArrayList<>();
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
        returnedPatients=new ArrayList<>();
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
        returnedAppointments=new ArrayList<>();
        for (int i = 0; i < appointments.size();i++){
            if (appointments.get(i).getDate().compareTo(StartTime)>0&&appointments.get(i).getDate().compareTo(endTime)<0){
                returnedAppointments.add(appointments.get(i));
            }
        }
        return returnedAppointments;
    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments,Calendar StartTime, Calendar endTime,Provider provider){
        returnedAppointments=new ArrayList<>();
        for (int i = 0; i < appointments.size();i++){
            if (appointments.get(i).getDate().compareTo(StartTime)>0&&appointments.get(i).getDate().compareTo(endTime)<0){
                for (int t= 0; t<appointments.get(i).getProviders().size();t++) {
                    if (appointments.get(i).getProviders().get(t).equals(provider)) {
                       returnedAppointments.add(appointments.get(i));
                    }
                }
            }
        }
        return returnedAppointments;
    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments,Calendar StartTime, Calendar endTime,Provider provider, Patient patient){
        returnedAppointments=new ArrayList<>();
        for (int i = 0; i < appointments.size();i++){
            if (appointments.get(i).getDate().compareTo(StartTime)>0&&appointments.get(i).getDate().compareTo(endTime)<0){
                for (int t= 0; t<appointments.get(i).getProviders().size();t++) {
                    if (appointments.get(i).getProviders().get(t).equals(provider)) {
                        if (appointments.get(i).getPatient().equals(patient)) {
                                    returnedAppointments.add(appointments.get(i));
                        }
                    }
                }
            }
        }
        return returnedAppointments;
    }
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments,Calendar StartTime, Calendar endTime,Provider provider, Patient patient, String code){
        returnedAppointments=new ArrayList<>();
        for (int i = 0; i < appointments.size();i++){
            if (appointments.get(i).getDate().compareTo(StartTime)>0&&appointments.get(i).getDate().compareTo(endTime)<0){
                for (int t= 0; t<appointments.get(i).getProviders().size();t++) {
                    if (appointments.get(i).getProviders().get(t).equals(provider)) {
                        if (appointments.get(i).getPatient().equals(patient)) {
                            for (int v = 0; v < appointments.get(i).getProcedures().size(); v++) {
                                if (appointments.get(i).getProcedures().get(v).getId().contains(code)) {
                                    returnedAppointments.add(appointments.get(i));
                                }
                            }
                        }
                    }
                }
            }
        }
        return returnedAppointments;
    }
}
