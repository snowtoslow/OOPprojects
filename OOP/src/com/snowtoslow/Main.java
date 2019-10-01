package com.snowtoslow;



import com.snowtoslow.Calculation.CalculationUnit;
import com.snowtoslow.Studs.Student;
import com.snowtoslow.universities.University;


import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Student studentUTM1 = new Student("Vova","Leadavschi","FCIM",20,2,8.45f);
        Student studentUTM2 = new Student("Taniuxa","Tsiguliova","FCIM",19,2,9.67f);
        Student studentUTM3 = new Student("Sanea","Osadcenko","FCIM",21,2,8.70f);

        Student studentULIM1 = new Student("Iliuha","Codrean","Limbi Straine", 22,3,8.15f);
        Student studentULIM2 = new Student("Evghenii","Kurakov","Limbi Straine",22,4,9.0f);
        Student studentULIM3 = new Student("Nastya","Drunk","Limbi Straine",22,4,7.56f);

        Student studentUSM1 = new Student("Maxim","Bolibot","Business and Administration",22,3,8.40f);
        Student studentUSM2 = new Student("Andrei","Lozovan","Business and Administration",22,3,9.70f);
        Student studentUSM3 = new Student("Olea","Shevcenko","Psychology",23,4,9.0f);



        University UTM = new University("TUM",1964,7,3);
        University ULIM = new University("ULIM",1992,2,3);
        University USM = new University("USM",1946,4,3);





        Student[] studentsUTM = {studentUTM1,studentUTM2,studentUTM3};
        Student[] studentsULIM = {studentULIM1,studentULIM2,studentULIM3};
        Student[] studentsUSM = {studentUSM1,studentUSM2,studentUSM3};





        float avgBetweenUniver = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("****University name******:");
            String nameOfUniver = scanner.next();

            CalculationUnit calculationUnit = new CalculationUnit();

            float averageOfUniversity = calculationUnit.calculate(nameOfUniver, studentsUTM, studentsULIM, studentsUSM);

            //System.out.println("Average of university is:"+ averageOfUniversity); SHOW AVERAGE OF STUDENTS OF EVERY UNIVERSITY

            avgBetweenUniver+=averageOfUniversity;
        }
        System.out.println("AVG  between universities = " + avgBetweenUniver/3);
    }
}
