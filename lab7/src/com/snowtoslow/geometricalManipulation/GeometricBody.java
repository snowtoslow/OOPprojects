package com.snowtoslow.geometricalManipulation;

import java.util.Random;

public abstract class GeometricBody {

    public abstract double getVolume();

    public abstract double getArea();

    public static final float pi = 3.14f;

    Random random = new Random();


    final double Length = random.nextDouble()*10;

    final double Width = random.nextDouble()*10;

    final double Height = random.nextDouble()*10;

    final double cubEDge = random.nextDouble()*10;

    final double sphereRadius = random.nextDouble()*10;

    double result;


}
