package com.snowtoslow.geometricalManipulation;

import java.util.Random;

public abstract class GeometricBody {

    public String name;

    public abstract double getVolume();

    public abstract double getArea();

    public static final float pi = 3.14f;

    Random random = new Random();


    final double Length = random.nextInt(10);

    final double Width = random.nextInt(10);

    final double Height = random.nextInt(10);

    final double cubEDge = random.nextInt(10);

    final double sphereRadius = random.nextInt(10);

    double result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
