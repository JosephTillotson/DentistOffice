package models;

public class Patient extends Insurance implements Business {
    private String name;

    private int id;

   private String  phoneNumber;

    private String email;

    private String paymentCard;

    private int amountOwed;

    /**
     * basic constructor for Patient
     */
    public Patient(){}

    /**
     * overloaded constructor for patent
     * @param name name of the patient
     * @param email email of the patent
     * @param paymentCard credit card of the patient
     * @param id idintification of the patient
     * @param phoneNumber phone number of the patent
     * @param amountOwed amount owed from the [atent
     * @param iname insurance name
     * @param memberID patents id from the  insureance
     * @param groupID the insurance id
     */
    public Patient(String name, String email, String paymentCard, int id, String phoneNumber, int amountOwed,String iname, int memberID, int groupID ){
        super(iname,memberID,groupID);
        this.setName(name);
        this.setEmail(email);
        this.setPaymentCard(paymentCard);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
        this.setAmountOwed(amountOwed);

    }

    /**
     * will get the phone number of the patent
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * will set the phone number
     * @param phoneNumber the phone number to be
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.contains("1000000000")||phoneNumber.contains("9999999999")){
            throw new IllegalArgumentException("pick a legal phone number");
        }else if (phoneNumber.contains("a")||phoneNumber.contains("b")||phoneNumber.contains("c")||phoneNumber.contains("d")||
                phoneNumber.contains("e")||phoneNumber.contains("f")||phoneNumber.contains("g")||phoneNumber.contains("h")||
                phoneNumber.contains("i")||phoneNumber.contains("j")||phoneNumber.contains("k")||phoneNumber.contains("l")||
                phoneNumber.contains("m")||phoneNumber.contains("n")||phoneNumber.contains("o")||phoneNumber.contains("p")||
                phoneNumber.contains("q")||phoneNumber.contains("r")||phoneNumber.contains("s")||phoneNumber.contains("t")||
                phoneNumber.contains("u")||phoneNumber.contains("v")||phoneNumber.contains("w")||phoneNumber.contains("x")||
                phoneNumber.contains("y")||phoneNumber.contains("z")){
            throw new IllegalArgumentException("you have to keep letters out of the phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * will get the payment card
     * @return will return the payment card
     */
    public String getPaymentCard() {

        return paymentCard;
    }

    /**
     * will set the paymentCard to be the [ayment card
     * @param paymentCard this will be the payment card to be.
     */
    public void setPaymentCard(String paymentCard) {
        if (paymentCard==null){
            throw new IllegalArgumentException("Payment card cant be null");
        }
        else if (paymentCard.contains("a")||paymentCard.contains("b")||paymentCard.contains("c")||paymentCard.contains("d")||
                paymentCard.contains("e")||paymentCard.contains("f")||paymentCard.contains("g")||paymentCard.contains("h")||
                paymentCard.contains("i")||paymentCard.contains("j")||paymentCard.contains("k")||paymentCard.contains("l")||
                paymentCard.contains("m")||paymentCard.contains("n")||paymentCard.contains("o")||paymentCard.contains("p")||
                paymentCard.contains("q")||paymentCard.contains("r")||paymentCard.contains("s")||paymentCard.contains("t")||
                paymentCard.contains("u")||paymentCard.contains("v")||paymentCard.contains("w")||paymentCard.contains("x")||
                paymentCard.contains("y")||paymentCard.contains("z")){
            throw new IllegalArgumentException("you have to keep letters out of the payment Card");
        }
        this.paymentCard = paymentCard;
    }

    /**
     * This will get the name of the Patient
     * @return will return the name of the patient
     */
    public String getName() {

        return name;
    }


    public void setName(String name) {
        if (name==null){
            throw new IllegalArgumentException("name cant be null");
        }
        this.name = name;
    }

    /**
     * will get the ID
     * @return will return the id that was set
     */
    public int getId() {

        return id;
    }

    /**
     * this will set the Id
     * @param id the id to be set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * will get the email
     * @return will return the emial
     */

    public String getEmail() {

        return email;
    }

    /**
     * will set the email
     * @param email this is the email to be set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * will return the amount
     * @return will return the amount due that the patient has
     */
    public int getAmountOwed() {

        return amountOwed;
    }

    /**
     * this will set the AMount owed
     * @param amountOwed this will set the amount owed
     */
    public void setAmountOwed(int amountOwed) {
        if (amountOwed<0){
            throw new IllegalArgumentException("this will be a positive amount");
        }
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
