package com.snowtoslow;



import com.snowtoslow.geometricalManipulation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {



    public static void main(String[] args) {

        Cub cub = new Cub();
        cub.setName("cub1");
        Sphere sphere = new Sphere();
        sphere.setName("sphere1");
        Parallelepiped parallelepiped = new Parallelepiped();
        parallelepiped.setName("paralelipiped");
        GeometricBodyController geometricBodyController = new GeometricBodyController();

        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();
        geometricBodies.add(cub);
        geometricBodies.add(parallelepiped);
        geometricBodies.add(sphere);


        geometricBodyController.getMaximumVolume(geometricBodies);
        geometricBodyController.getMaximumArea(geometricBodies);














    }
}
