package com.xworkz.satelliteapp;

import com.xworkz.satelliteapp.satellite.Satellite;
import com.xworkz.satelliteapp.satellite.spaceprobe.SpaceProbe;

public class SatelliteRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Satellite satellite = new Satellite();

        satellite.orbit();
        satellite.transmitSignal();
        satellite.captureImages();
        satellite.collectData();
        satellite.monitorWeather();


        Satellite satellite1 = new SpaceProbe();

        satellite1.orbit();
        satellite1.transmitSignal();
        satellite1.captureImages();
        satellite1.collectData();
        satellite1.monitorWeather();


        SpaceProbe spaceProbe = new SpaceProbe();

        spaceProbe.orbit();
        spaceProbe.transmitSignal();
        spaceProbe.captureImages();
        spaceProbe.collectData();
        spaceProbe.monitorWeather();

        System.out.println("Main Ended");
    }
}