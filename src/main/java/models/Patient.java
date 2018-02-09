package models;

public class Patient extends Insurance implements Business {
    private String name;

    private int id;

    private int phoneNumber;

    private String email;

    private String paymentCard;

    private int amountOwed;

    public Patient(){}
    public Patient(String name, String email, String paymentCard, int id, int phoneNumber, int amountOwed,String iname, int memberID, int groupID ){
        super(iname,memberID,groupID);
        this.setName(name);
        this.setEmail(email);
        this.setPaymentCard(paymentCard);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setAmountOwed(amountOwed);

    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentCard() {

        return paymentCard;
    }

    public void setPaymentCard(String paymentCard) {
        this.paymentCard = paymentCard;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmountOwed() {

        return amountOwed;
    }

    public void setAmountOwed(int amountOwed) {
        this.amountOwed = amountOwed;
    }

    @Override
    public boolean equals(Object obj) {
        Patient p = (Patient)obj;
        return this.getId() == p.getId();
    }

    @Override
    public String toString() {
        return "Patient Name: " + this.getName() + ", " + "Patient ID: " + this.getId()
                + ", " + "Patient Email: " + this.getEmail() + ", " + "Patient Payment Card: " +
                this.getPaymentCard() + ", " + "Amount Owed: " + this.getAmountOwed() + super.toString();
    }
}
