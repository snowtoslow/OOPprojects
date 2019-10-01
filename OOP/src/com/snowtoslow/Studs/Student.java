package com.snowtoslow.Studs;

public class Student {

    private String firstName;

    private String secondName;

    private String Faculty;

    private int studentAge;

    private int yearOfStudy;

    public float averageMark;

    public Student(String firstName, String secondName, String Faculty, int studentAge, int yearOfStudy, float averageMark){

        this.firstName = firstName;

        this.secondName = secondName;

        this.Faculty = Faculty;

        this.studentAge = studentAge;

        this.yearOfStudy = yearOfStudy;

        this.averageMark = averageMark;
    }
}
