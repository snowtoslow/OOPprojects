package com.snowtoslow.Calculation;

import com.snowtoslow.Studs.Student;

public class CalculationUnit{

    float sum = 0;


    public float calculate(String name, Student[] studentsUTM, Student[] studentsULIM, Student[] studentsUSM){

        switch (name){
            case "UTM":
                for (int i = 0; i < studentsUTM.length; i++) {

                    sum+=studentsUTM[i].averageMark;
                }
                break;
            case "ULIM":
                for (int i = 0; i < studentsULIM.length; i++) {

                    sum+=studentsULIM[i].averageMark;
                }
                break;
            case "USM":
                for (int i = 0; i < studentsUSM.length; i++) {

                    sum += studentsUSM[i].averageMark;

                }
        }
        float smth = sum / 3;//Calculate average;
        return smth;
    }
}

