package com.snowtoslow.geometricalManipulation;

public class Cub implements GeometricBody{


    private String name;

    private double result;

    @Override
    public double getVolume() {

        result = Math.pow(cubEDge,3);

        return result;
    }

    @Override
    public double getArea() {

        result = Math.pow(cubEDge,2);

        return result;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }


}
