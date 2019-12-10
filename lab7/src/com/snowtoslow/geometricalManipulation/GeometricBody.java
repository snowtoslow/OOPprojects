package com.snowtoslow.geometricalManipulation;

import java.util.Random;

public interface GeometricBody {

    double getVolume();

    double getArea();

    float pi = 3.14f;

    Random random = new Random();


    double Length = random.nextInt(10);

    double Width = random.nextInt(10);

    double Height = random.nextInt(10);

    double cubEDge = random.nextInt(10);

    double sphereRadius = random.nextInt(10);


    String getName();

    void setName(String name);


}
