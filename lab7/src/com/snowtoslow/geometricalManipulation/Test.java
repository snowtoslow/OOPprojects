package com.snowtoslow.geometricalManipulation;

import java.util.ArrayList;

public class Test {

    public void  getValuesVolume(ArrayList<GeometricBody> list){
        for (GeometricBody geometricBody : list){

            System.out.println("Volume: " + geometricBody.getName() + "->" + geometricBody.getVolume() );
        }
    }

    public void  getValuesArea(ArrayList<GeometricBody> list){
        for (GeometricBody geometricBody : list){
            System.out.println("Area: " + geometricBody.getName() + ":" + geometricBody.getArea());
        }
    }
}
