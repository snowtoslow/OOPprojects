package com.snowtoslow;

public class Patient extends Person {
    String id;
    String age;
    String accepted;
    String sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialRegs;
    void name(){
        super.name();
    }
    public String gender(String inputGender){
        super.gender(inputGender);
        return inputGender;
    }
    public String birthDate(String date){
        super.birthDate(date);
        return date;
    }

}
