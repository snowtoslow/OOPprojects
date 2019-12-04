package com.snowtoslow.geometricalManipulation;

import java.util.ArrayList;



public class GeometricBodyController {

    public double maxValue = 0;

    public void getMaximumArea(ArrayList<GeometricBody> list){

        for (GeometricBody body : list) {
            if (body.getArea() > maxValue) {
                maxValue = body.getArea();
            }
        }
        System.out.println("Maximum Area: " + maxValue);
        for (GeometricBody geometricBody : list) {
            if (geometricBody.getArea() == maxValue) {
                System.out.println(list.get(list.indexOf(geometricBody)));
            }
        }
    }

    public void getMaximumVolume(ArrayList<GeometricBody> list){

        for (GeometricBody body : list) {
            if (body.getVolume() > maxValue) {
                maxValue = body.getVolume();
            }
        }

        System.out.println("Maximum Volume:" + maxValue);
        for (GeometricBody geometricBody : list) {
            if (geometricBody.getVolume() == maxValue) {
                System.out.println(list.get(list.indexOf(geometricBody)));
            }
        }
    }



}
