package com.snowtoslow.geometricalManipulation;

public class Cub extends GeometricBody {



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
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
