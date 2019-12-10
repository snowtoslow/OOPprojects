package com.snowtoslow;

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    String phone;
    String city;
    String street;
    String houseNumber;
    void name(){
        System.out.println(givenName + " " + middleName + " " + familyName);
    }

    public String gender(String inputGender){
        return inputGender;
    }

    public String birthDate(String date){
        return date;
    }
    void homeAddress(){
        System.out.println(city + " " + street + " " + houseNumber);
    }


}
