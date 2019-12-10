package com.snowtoslow.geometricalManipulation;

import java.util.ArrayList;



public class GeometricBodyController {

    public double maxValue = 0;

    public double maxValue2 = 0;

    public String nameOfObject = "";


    public void getMaximumArea(ArrayList<GeometricBody> lisForArea){

        for (GeometricBody body : lisForArea) {
            if (body.getArea() > maxValue2) {
                maxValue2 = body.getArea();
            }
        }
        for (GeometricBody geometricBodyArea : lisForArea) {
            if (geometricBodyArea.getArea() == maxValue2) {
                System.out.println("Maximum Area: " + geometricBodyArea.getName() + " --> " + geometricBodyArea.getArea() + " units");
            }
        }
    }

    public void getMaximumVolume(ArrayList<GeometricBody> listForVolume){


        for (GeometricBody body : listForVolume) {
            if (body.getVolume() > maxValue) {
                maxValue = body.getVolume();
            }
        }
        for (GeometricBody geometricBody : listForVolume) {
            if (geometricBody.getVolume() == maxValue) {
                System.out.println("Maximum Volume: " + geometricBody.getName() + " --> " + geometricBody.getVolume() + " units");
            }
        }
    }

    //tak kak eu am aishi ceva cu random si Dorin vrea sa verifice daca este totul ok;






}
