package controller;

import models.*;
import view.textUI;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Controller extends Search {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static final int ADD_USER = 0;
    private static final int ADD_PATIENT = 1;
    private static final int ADD_PROVIDER = 2;
    private static final int ADD_APPOINTMENT = 3;
    private static final int ADD_PROCEDURE = 4;
    private static final int SEARCH_FOR = 5;
    private static final int RECORD_PAYMENT_FROM_INSURANCE = 6;
    private static final int RECORD_PAYMENT_FROM_PATIENT = 7;
    private static final int EXIT = 8;

    private static final int SEARCH_BY_FIRST_NAME = 0;
    private static final int SEARCH_BY_FIRST_LAST_NAME = 1;
    private static final int SEARCH_BY_FIRST_LAST_USERNAME = 2;
    private static final int SEARCH_BY_FIRST_LAST_TITLE = 2;
    private static final int SEARCH_BY_FIRST_LAST_INSURANCE_NAME = 2;
    private static final int RETURN_TO_SEARCH_MENU = 7;
    private static final int RETURN_TO_MAIN_MENU = 8;

    private static final int SEARCH_BY_DATE = 0;
    private static final int SEARCH_BY_DATE_PROV = 1;
    private static final int SEARCH_BY_DATE_PROV_PAT = 2;
    private static final int SEARCH_BY_DATE_PROV_PAT_CODE = 3;

    private static final int SEARCH_FOR_USER = 0;
    private static final int SEARCH_FOR_PATIENT = 1;
    private static final int SEARCH_FOR_PROVIDER = 2;
    private static final int SEARCH_FOR_APPOINTMENT = 3;


    private textUI ui = new textUI();

    User newUser = new User();
    Patient newPatient = new Patient();
    Appointment newAppointment = new Appointment();
    Provider newProvider = new Provider();
    Procedure newProcedure = new Procedure();
    String Userchoice;


    private ArrayList<Patient> patients = new ArrayList<>();

    private ArrayList<User> users = new ArrayList<>();

    private ArrayList<Appointment> appointments = new ArrayList<>();

    private ArrayList<Provider> providers = new ArrayList<>();

    private ArrayList<Procedure> procedures = new ArrayList<>();


    public void run() throws IOException {
        boolean ye = true;
        String Login;
        System.out.println("Welcome Administrator, Please Log in");
        while(ye) {
            Login = br.readLine();
            if (Login.equals("1234Password")) {
                mainMenu();
                ye = false;
            } else
                System.out.println("Invalid Password, Please try Again");
        }
    }

    public void mainMenu() throws IOException, NullPointerException {
        boolean Exit = true;

        while (Exit) {
            int menuChoice = this.ui.printMenu(menuOptions());
            switch (menuChoice) {
                case ADD_USER:
                    addUser(newUser);
                    break;
                case ADD_PATIENT:
                    addPatient(newPatient);
                    break;
                case ADD_PROVIDER:
                    addProvider(newProvider);
                    break;
                case ADD_APPOINTMENT:
                    addAppointment(newAppointment);
                    break;
                case ADD_PROCEDURE:
                    addProcedure(newProcedure);
                case SEARCH_FOR:
                    searchMenu();
                    break;
                case RECORD_PAYMENT_FROM_INSURANCE:
                    RecordPymntfrmInsu();
                    break;
                case RECORD_PAYMENT_FROM_PATIENT:
                    RecordPymntfrmPat();
                    break;
                case EXIT:
                    Save();
                    Exit = false;

            }
        }


    }


    public void searchMenu() throws IOException {
        boolean exit = false;

        while (!exit) {
            int menuChoice = this.ui.printMenu(searchOptions());
            switch (menuChoice) {
                case SEARCH_FOR_USER:
                    Usermenu();
                    break;
                case SEARCH_FOR_PATIENT:
                    patientMenu();
                    break;
                case SEARCH_FOR_PROVIDER:
                    providerMenu();
                    break;
                case SEARCH_FOR_APPOINTMENT:
                    appointmentMenu();
                    break;
                case RETURN_TO_MAIN_MENU:
                    mainMenu();
                    break;
            }
        }

    }


    private void appointmentMenu() throws IOException {

        boolean Exit = false;

        while (!Exit) {
            int menuChoice = this.ui.printMenu(appointmentSearchOptions());
            switch (menuChoice) {
                case SEARCH_BY_DATE:
                    break;
                case SEARCH_BY_DATE_PROV:
                    break;
                case SEARCH_BY_DATE_PROV_PAT:
                    break;
                case SEARCH_BY_DATE_PROV_PAT_CODE:
                    break;
                case RETURN_TO_SEARCH_MENU:
                    break;
                case RETURN_TO_MAIN_MENU:
                    break;
            }
        }

    }

    private void providerMenu() throws IOException {
        boolean Exit = false;

        while (!Exit) {
            int menuChoice = this.ui.printMenu(providerSearchOptions());
            switch (menuChoice) {
                case SEARCH_BY_FIRST_NAME:
                    searchProvider(providers, newProvider.getName());
                    break;
                case SEARCH_BY_FIRST_LAST_NAME:
                    searchProvider(providers, newProvider.getName(), newProvider.getLastName());
                    break;
                case SEARCH_BY_FIRST_LAST_TITLE:
                    searchProvider(providers, newProvider.getName(), newProvider.getLastName(), newProvider.getTitle());
                    break;
                case RETURN_TO_SEARCH_MENU:
                    searchMenu();
                case RETURN_TO_MAIN_MENU:
                    mainMenu();
                    break;
            }
        }


    }

    private void Usermenu() throws IOException {
        boolean Exit = false;

        while (!Exit) {
            int menuChoice = this.ui.printMenu(userSearchOptions());
            switch (menuChoice) {
                case SEARCH_BY_FIRST_NAME:
                    searchUser(users, newUser.getFirstName());
                    break;
                case SEARCH_BY_FIRST_LAST_NAME:
                    searchUser(users, newUser.getFirstName(), newUser.getLastName());
                    break;
                case SEARCH_BY_FIRST_LAST_INSURANCE_NAME:
                    searchUser(users, newUser.getFirstName(), newUser.getLastName(), newUser.getUserName());
                    break;
                case RETURN_TO_SEARCH_MENU:
                    searchMenu();
                case RETURN_TO_MAIN_MENU:
                    mainMenu();
                    break;
            }
        }

    }


    public void patientMenu() throws IOException {
        boolean Exit = false;

        while (!Exit) {
            int patientChoice = this.ui.printMenu(patientOptions());
            switch (patientChoice) {
                case SEARCH_BY_FIRST_NAME:
                    searchPatient(patients, newPatient.getName());
                    break;
                case SEARCH_BY_FIRST_LAST_NAME:
                    searchPatient(patients, newPatient.getName(), newPatient.getLastName());
                    break;
                case SEARCH_BY_FIRST_LAST_INSURANCE_NAME:
                    searchPatient(patients, newPatient.getName(), newPatient.getLastName(), newPatient.getIname());
                    break;
                case RETURN_TO_SEARCH_MENU:
                    searchMenu();
                    break;
                case RETURN_TO_MAIN_MENU:
                    mainMenu();
                    break;
            }
        }

    }

    public void addUser(User user) throws IOException {
        boolean nah = true;
        while (nah) {
            System.out.println("Enter the first name of the User");
            user.setFirstName(br.readLine());
            System.out.println("Enter the last name of the User");
            user.setLastName(br.readLine());
            System.out.println("Enter the Username");
            user.setUserName(br.readLine());
            System.out.println("Enter the Password");
            user.setPassword(br.readLine());
            users.add(user);
            returnedUsers.add(user);
            System.out.println("Would you like to add another user? type 1 for yes, type 2 for no");
            Userchoice = br.readLine();
            if (Userchoice.equals("1")) {
                nah = true;
            } else if (Userchoice.equals("2")) {
                nah = false;
            } else
                System.out.println("Invalid Input, Please Try Again.");
        }
    }

    public void addAppointment(Appointment appointment) {
appointment.setPatient(newPatient);
appointment.setProviders(providers);

    }

    public void addPatient(Patient patient) throws IOException {
        boolean meh = true;
        boolean thing = true;
        while (meh) {
            System.out.println("Enter in the patient's first name");
            patient.setName(br.readLine());
            System.out.println("Enter in the patient's last name");
            patient.setLastName(br.readLine());
            System.out.println("Enter the patient's Payment Card number");
            patient.setPaymentCard(br.readLine());
            System.out.println("Enter the Patients Phonenumber");
            patient.setPhoneNumber(br.readLine());
            System.out.println("Enter the Patients ID");
            patient.setId(br.read());
            System.out.println("Enter the patients Insurance Name");
            patient.setIname(br.readLine());
            System.out.println("Enter the patients Insurance ID");
            patient.setMemberID(br.read());
            System.out.println("Enter the Insurance ID");
            patient.setGroupID(br.read());
            while (thing) {
                System.out.println("Enter in the patient's Email");
                patient.setEmail(br.readLine());
                if (patient.getEmail().contains("@")) {
                    if (patient.getEmail().contains(".com")) {
                        thing = false;
                    } else
                        System.out.println("Invalid Email, Please Try Again.");
                } else
                    System.out.println("Invalid Email, Please Try Again.");

            }
            patients.add(newPatient);
            returnedPatients.add(newPatient);
            System.out.println("Would you Like to add another Patient? type 1 for yes and 2 for no");
            Userchoice = br.readLine();
            if (Userchoice.equals("1")) {
                meh = true;
            } else if (Userchoice.equals("2")) {
                meh = false;
            } else
                System.out.println("Invalid Input, Please try again");

        }
    }

    public void addProvider(Provider provider) throws IOException {
        int choiceUser;
        boolean nyeh = true;
        while (nyeh) {
            System.out.println("Enter the first name");
            provider.setName(br.readLine());
            System.out.println("Enter the last name");
            provider.setLastName(br.readLine());
            System.out.println("Enter the ID");
            provider.setId(br.read());
            System.out.println("Enter the position title, Type 1 for a Dentist, Type 2 for a Dental Assistant, Type 3 for Hygenist");
            choiceUser = br.read();
            if (choiceUser == 1) {
                provider.setTitle("Dentist");
            } else if (choiceUser == 2) {
                provider.setTitle("Dental Assistant");
            } else if (choiceUser == 3) {
                provider.setTitle("Hygenist");
            } else
                System.out.println("Invalid Input, Please try again.");
            providers.add(provider);
            returnedProviders.add(provider);

            System.out.println("Would you like to add another provider? type 1 for yes, type 2 for no");
            Userchoice = br.readLine();
            if (Userchoice.equals("1")) {
                nyeh = true;
            } else if (Userchoice.equals("2")) {
                nyeh = false;
            } else
                System.out.println("Invalid Input, please try again");
        }
    }
    public void addProcedure(Procedure procedure) throws IOException {
        boolean m = true;
        System.out.println("Enter the Name of the Procedure");
        procedure.setName(br.readLine());
        while (m) {
            System.out.println("Enter the Procedure ID, it Must start with D.");
            procedure.setId(br.readLine());
            if (procedure.getId().startsWith("D")) {
                m = false;
            } else
                System.out.println("Invalid Procedure Code, please try again.");


        }
    }

    public void RecordPymntfrmPat() throws IOException {
        System.out.println("Enter the amount payed by the Patient");
        newPatient.setPatientPayment(br.read());
    }

    public void RecordPymntfrmInsu() throws IOException {
        System.out.println("Enter the amount payed by the Insurance");
        newPatient.setInsurancePayment(br.read());
    }

    public void Save() throws FileNotFoundException {
        try {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DentistData.Dat"))) {
                try {
                    for (int i = 0; i < patients.size(); i++) {
                        out.writeObject(this.patients.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    for (int i = 0; i < users.size(); i++) {
                        out.writeObject(this.users.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    for (int i = 0; i < appointments.size(); i++) {
                        out.writeObject(this.appointments.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Load() {
        try {
            try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("DentistData.Dat"))) {
                try {
                    for (int i = 0; i < patients.size(); i++) {
                        in.writeObject(this.patients.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    for (int i = 0; i < users.size(); i++) {
                        in.writeObject(this.users.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    for (int i = 0; i < appointments.size(); i++) {
                        in.writeObject(this.appointments.get(i));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private Map<Integer, String> menuOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(ADD_USER, "Add User");
        menu.put(ADD_PATIENT, "Add Patient");
        menu.put(ADD_APPOINTMENT, "Add Appointment");
        menu.put(ADD_PROVIDER, "Add Provider");
        menu.put(ADD_PROCEDURE, "Add Procedure");
        menu.put(SEARCH_FOR, "Search For:");
        menu.put(RECORD_PAYMENT_FROM_INSURANCE, "Record Payment From Insurance");
        menu.put(RECORD_PAYMENT_FROM_PATIENT, "Record Payment From Patient");
        menu.put(EXIT, "Exit");
        return menu;

    }

    private Map<Integer, String> patientOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(SEARCH_BY_FIRST_NAME, "Search by first name");
        menu.put(SEARCH_BY_FIRST_LAST_NAME, "Search by first and last name");
        menu.put(SEARCH_BY_FIRST_LAST_INSURANCE_NAME, "Search by first, last, and insurance name");
        menu.put(RETURN_TO_MAIN_MENU, "Return to the main menu");
        return menu;

    }

    private Map<Integer, String> searchOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(SEARCH_FOR_USER, "Search for User");
        menu.put(SEARCH_FOR_PATIENT, "Search for Patient");
        menu.put(SEARCH_FOR_PROVIDER, "Search for Provider");
        menu.put(SEARCH_FOR_APPOINTMENT, "Search for Appointment");
        menu.put(RETURN_TO_MAIN_MENU, "Return to Main Menu");

        return menu;

    }

    private Map<Integer, String> userSearchOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(SEARCH_BY_FIRST_NAME, "Search by first name");
        menu.put(SEARCH_BY_FIRST_LAST_NAME, "Search by first and last name");
        menu.put(SEARCH_BY_FIRST_LAST_USERNAME, "Search by first, last, and Username");
        menu.put(RETURN_TO_SEARCH_MENU, "Return to Search Menu");
        menu.put(RETURN_TO_MAIN_MENU, "Return to Main Menu");

        return menu;

    }

    private Map<Integer, String> providerSearchOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(SEARCH_BY_FIRST_NAME, "Search by first name");
        menu.put(SEARCH_BY_FIRST_LAST_NAME, "Search by first and last name");
        menu.put(SEARCH_BY_FIRST_LAST_TITLE, "Search by first, last, and Job Title");
        menu.put(RETURN_TO_SEARCH_MENU, "Return to Search Menu");
        menu.put(RETURN_TO_MAIN_MENU, "Return to Main Menu");

        return menu;

    }

    private Map<Integer, String> appointmentSearchOptions() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(SEARCH_BY_DATE, "Search by Date");
        menu.put(SEARCH_BY_DATE_PROV, "Search by Date and Provider");
        menu.put(SEARCH_BY_DATE_PROV_PAT, "Search by Date, Provider, and Patient");
        menu.put(SEARCH_BY_DATE_PROV_PAT_CODE, "Search by Date, Provider, Patient, and Procedure Code");
        menu.put(RETURN_TO_SEARCH_MENU, "Return to Search Menu");
        menu.put(RETURN_TO_MAIN_MENU, "Return to Main Menu");

        return menu;


    }
}
