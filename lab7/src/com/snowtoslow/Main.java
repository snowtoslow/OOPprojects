package com.snowtoslow;



import com.snowtoslow.geometricalManipulation.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Cub cub = new Cub();
        Sphere sphere = new Sphere();
        Parallelepiped parallelepiped = new Parallelepiped();
        GeometricBodyController geometricBodyController = new GeometricBodyController();



        ArrayList<GeometricBody> list = new ArrayList<>();
        list.add(cub);
        list.add(sphere);
        list.add(parallelepiped);
        list.add(cub);
        list.add(sphere);

        geometricBodyController.getMaximumArea(list);
        geometricBodyController.getMaximumVolume(list);








    }
}
