package controller;

import models.Appointment;
import models.Business;
import models.Patient;
import models.User;
import view.textUI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Controller {

    private static final int ADD_USER = 0;
    private static final int SEARCH_FOR_PATIENT = 1;
    private static final int RECORD_PAYMENT_FROM_INSURANCE = 2;
    private static final int RECORD_PAYMENT_FROM_PATIENT = 3;
    private static final int LOG_IN = 4;
    private static final int LOG_OUT = 5;
    private static final int EXIT = 6;

    private static final int SEARCH_BY_FIRST_NAME = 0;
    private static final int SEARCH_BY_LAST_NAME = 1;
    private static final int SEARCH_BY_INSURANCE_NAME = 2;
    private static final int RETURN_TO_MAIN_MENU = 3;


    private textUI ui;

    User newUser = new User();


    private ArrayList<Patient> patients;

    private ArrayList<User> users;

    private ArrayList<Appointment> appointments;

    public void searchMenu(){


    }

    public void mainMenu() throws IOException{
        boolean Exit = false;

        while(!Exit){
            int menuChoice = this.ui.printMenu(menuOptions());
            switch (menuChoice){
                case ADD_USER:
                    addUser(newUser);
                    break;
                case SEARCH_FOR_PATIENT:
                    patientMenu();
                    break;
                case RECORD_PAYMENT_FROM_INSURANCE:
                    break;
                case RECORD_PAYMENT_FROM_PATIENT:
                    break;
                case LOG_IN:
                    break;
                case LOG_OUT:
                    break;
                case EXIT:
                    Save();
                    Exit = true;

            }
        }


    }



    public void patientMenu() throws  IOException{
        boolean PExit = false;

        while(!PExit){
            int patientChoice = this.ui.printMenu(patientOptions());
            switch (patientChoice){
                case SEARCH_BY_FIRST_NAME:

                    break;
                case SEARCH_BY_LAST_NAME:
                    break;
                case SEARCH_BY_INSURANCE_NAME:
                    break;
                case RETURN_TO_MAIN_MENU:
                    mainMenu();
                    break;
            }
        }

    }

    public void addUser(User user){


    }

    public void addAppointment(Appointment appointment){


    }

    public void addPatient(Patient patient){


    }

    public void Save() throws FileNotFoundException, IOException{
        try{
            try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DentistData.Dat"))){
                try{
                    for (int i = 0; i < patients.size(); i++) {
                        out.writeObject(this.patients.get(i));
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
                try{
                    for (int i = 0; i < users.size(); i++) {
                        out.writeObject(this.users.get(i));
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
                try{
                    for (int i = 0; i < appointments.size(); i++) {
                        out.writeObject(this.appointments.get(i));
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }

            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Load(){


    }
    private Map<Integer,String> menuOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(ADD_USER, "Add User");
        menu.put(SEARCH_FOR_PATIENT, "Search for Patient");
        menu.put(RECORD_PAYMENT_FROM_INSURANCE, "Record Payment From Insurance");
        menu.put(RECORD_PAYMENT_FROM_PATIENT, "Record Payment From Patient");
        menu.put(LOG_IN, "Log in");
        menu.put(LOG_OUT, "Log Out");
        menu.put(EXIT, "Exit");
        return menu;

    }
    private Map<Integer,String> patientOptions() {
        Map<Integer, String> pmenu = new HashMap<>();
        pmenu.put(SEARCH_BY_FIRST_NAME, "Search by first name");
        pmenu.put(SEARCH_BY_LAST_NAME, "Search by last name");
        pmenu.put(SEARCH_BY_INSURANCE_NAME, "Search by insurance name");
        pmenu.put(RETURN_TO_MAIN_MENU, "Return to the main menu");
        return pmenu;

    }
}
