package com.joramkabach;

public class PersonalIdentity {
    private String myName;
    private String myGender;

    public PersonalIdentity(String myName){
        this.myName = myName;
    }
    public PersonalIdentity(String myName, String myGender){
        this.myName = myName;
        this.myGender = myGender;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }
    public void setMyGender(String myGender){
        this.myGender = myGender;
    }
    public String getMyName(){
        return myName;
    }
    public String getMyGender(){
        return myGender;
    }
}

