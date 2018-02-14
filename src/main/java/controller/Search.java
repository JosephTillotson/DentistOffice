package controller;


import models.*;

import java.util.ArrayList;
import java.util.Calendar;

public class Search {
    private ArrayList<User> returnedUsers;

    private ArrayList<Provider> returnedProviders;

    private ArrayList<Patient> returnedPatients;

    private ArrayList<Appointment> returnedAppointments;

    /**
     * will search for the user based on first name
     * @param users the sete of all of the users
     * @param firstname the first name that is being searched
     * @return all the users with teh specified first name
     */
    public ArrayList<User> searchUser(ArrayList<User> users,String firstname){
        returnedUsers=new ArrayList<>();
        for (int i = 0; i<users.size();i++){
            if (users.get(i).getFirstName().equals(firstname)){
                returnedUsers.add(users.get(i));
            }
        }
        return returnedUsers;
    }
    /**
     * will search for the user based on first name
     * @param users the sete of all of the users
     * @param firstname the first name that is being searched
     * @param  lastName the last name of the usear searched for
     * @return all the users with teh specified first name
     */
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
    /**
     * will search for the user based on first name
     * @param users the sete of all of the users
     * @param firstName the first name that is being searched
     * @param  lastName the last name of the usear searched for
     *                  @param userName is the username that your searching for
     * @return all the users with teh specified first name
     */
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

    /**
     * will search for providers
     * @param providers the providers that are being through for
     * @param firstName the first name of the provider
     * @return will return all providers that have the spoecfied qualities
     */
    public ArrayList<Provider> searchProvider(ArrayList<Provider> providers, String firstName){
     returnedProviders=new ArrayList<>();
     for (int i = 0;i<providers.size();i++){
         if (providers.get(i).getName().contains(firstName)){
             returnedProviders.add(providers.get(i));
         }
     }
     return returnedProviders;
    }

    /**
     will search for providers
     * @param providers the providers that are being through for
     * @param firstName the first name of the provider
     * @param lastName last name of teh provider taht is being searhed for
     * @return will return the array of the providers witht eh specified name
     */
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
    /**
     will search for providers
     * @param providers the providers that are being through for
     * @param firstName the first name of the provider
     * @param lastName last name of teh provider taht is being searhed for
     *@param  title the title of the provider
     * @return will return the array of the providers witht eh specified name
     */
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

    /**
     * search for the patients with specified qualities
     * @param patients the array of patients that are being searched through
     * @param firstName the first name of the patient
     * @return will return teh patients array with patients with the specified qualities
     */
    public ArrayList<Patient> searchPatient(ArrayList<Patient> patients, String firstName){
        returnedPatients=new ArrayList<>();
        for (int i = 0; i<patients.size(); i++){
            if (patients.get(i).getName().contains(firstName)){
                returnedPatients.add(patients.get(i));
            }
        }
        return returnedPatients;
    }
/**
 * search for the patients with specified qualities
 * @param patients the array of patients that are being searched through
 * @param firstName the first name of the patient
 * @param lastName the last name of the patient
 * * @return will return teh patients array with patients with the specified qualities
 */
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
    /**
     * search for the patients with specified qualities
     * @param patients the array of patients that are being searched through
     * @param firstName the first name of the patient
     * @param lastName the last name of the patient
     * @param insuranceName the name of the insurance
     * * @return will return teh patients array with patients with the specified qualities
     */
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

    /**
     * wll search for specified areas
     * @param appointments the appointments to be searched through
     * @param StartTime the time it starts
     * @param endTime time it ends
     * @return will return a array of all the Appointments in the specified times
     */
    public ArrayList<Appointment> searchAppointment(ArrayList<Appointment> appointments, Calendar StartTime, Calendar endTime){
        returnedAppointments=new ArrayList<>();
        for (int i = 0; i < appointments.size();i++){
            if (appointments.get(i).getDate().compareTo(StartTime)>0&&appointments.get(i).getDate().compareTo(endTime)<0){
                returnedAppointments.add(appointments.get(i));
            }
        }
        return returnedAppointments;
    }

    /**
     * wll search for specified areas
     * @param appointments the appointments to be searched through
     * @param StartTime the time it starts
     * @param endTime time it ends
     * @param provider the provider to be searched for
     * @return will return a array of all the appoiintments in teh specified times.
     */
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

    /**
     * wll search for specified areas
     * @param appointments the appointments to be searched through
     * @param StartTime the time it starts
     * @param endTime time it ends
     * @param provider the provider to be searched for
     * @param patient the patient to be searched for
     * @return will returna array of all the Appointmets in the specified areas
     */
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

    /**
     * wll search for specified areas
     * @param appointments the appointments to be searched through
     * @param StartTime the time it starts
     * @param endTime time it ends
     * @param provider the provider to be searched for
     * @param patient the patient to be searched for
     * @param code the procedural code
     * @return will return array of all the appointments with the specifeid areas
     */
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
