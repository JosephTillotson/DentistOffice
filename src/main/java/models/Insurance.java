package models;

import java.io.InputStreamReader;

public class Insurance implements Business{

    private String name;

    private int groupID;

    private int memberID;

    public Insurance(){}
    public Insurance(String name, int memberID, int groupID){
        this.setName(name);
        this.setMemberID(memberID);
        this.setGroupID(groupID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object obj) {
        Insurance insurance = (Insurance)obj;

        return this.getName() == insurance.getName() &&
                this.getMemberID() == insurance.getMemberID() &&
                this.getGroupID() == insurance.getGroupID();
    }

    @Override
    public String toString() {
        return "Insurance Provider: " + this.getName() + ", " + "MemberID: " + this.getMemberID() +
                ", " + "GroupID: " + this.getGroupID();
    }
}

