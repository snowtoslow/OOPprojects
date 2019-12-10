package com.snowtoslow.geometricalManipulation;

public class Parallelepiped extends GeometricBody {


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
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}