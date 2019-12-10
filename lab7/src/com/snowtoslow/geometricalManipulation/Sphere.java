package com.snowtoslow.geometricalManipulation;

public class Sphere extends GeometricBody {



    @Override
    public double getVolume() {

        result = (4 * (Math.pow(sphereRadius,3)) * pi)/3;

        return result;
    }

    @Override
    public double getArea() {

        result = 4 * pi * Math.pow(sphereRadius,2);

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
