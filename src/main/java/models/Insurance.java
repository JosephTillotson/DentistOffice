package models;

import java.io.InputStreamReader;

public class Insurance implements Business{

    private String iname;

    private int groupID;

    private int memberID;

    private int insurancePayment;

    public Insurance(){}
    public Insurance(String name, int memberID, int groupID, int insurancePayment){
        this.setIname(name);
        this.setMemberID(memberID);
        this.setGroupID(groupID);
        this.setInsurancePayment(insurancePayment);
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public int getMemberID() {

        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getGroupID() {

        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getInsurancePayment() {
        return insurancePayment;
    }

    public void setInsurancePayment(int insurancePayment) {
        this.insurancePayment = insurancePayment;
    }

    @Override
    public boolean equals(Object obj) {
        Insurance insurance = (Insurance)obj;

        return this.getIname() == insurance.getIname() &&
                this.getMemberID() == insurance.getMemberID() &&
                this.getGroupID() == insurance.getGroupID();
    }

    @Override
    public String toString() {
        return "Insurance Provider: " + this.getIname() + ", " + "MemberID: " + this.getMemberID() +
                ", " + "GroupID: " + this.getGroupID();
    }
}

