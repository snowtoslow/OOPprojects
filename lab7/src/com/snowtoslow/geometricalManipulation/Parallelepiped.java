package com.snowtoslow.geometricalManipulation;

public class Parallelepiped implements GeometricBody{

    private double result;
    private String name;

    @Override
    public double getVolume() {

        result = Length * Width * Height;

        return result;

    }

    @Override
    public double getArea() {

        result = 2*((Length * Width) + (Width * Height) + (Length * Height));

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
