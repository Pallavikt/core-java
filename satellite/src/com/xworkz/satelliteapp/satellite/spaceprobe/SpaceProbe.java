package com.xworkz.satelliteapp.satellite.spaceprobe;

import com.xworkz.satelliteapp.satellite.Satellite;

public class SpaceProbe extends Satellite {

    @Override
    public void orbit() {
        System.out.println("SpaceProbe Orbiting");
    }

    @Override
    public void transmitSignal() {
        System.out.println("SpaceProbe Transmitting Signal");
    }

    @Override
    public void captureImages() {
        System.out.println("SpaceProbe Capturing Images");
    }

    @Override
    public void collectData() {
        System.out.println("SpaceProbe Collecting Data");
    }

    @Override
    public void monitorWeather() {
        System.out.println("SpaceProbe Monitoring Weather");
    }

    @Override
    public void trackLocation() {
        System.out.println("SpaceProbe Tracking Location");
    }

    @Override
    public void communicate() {
        System.out.println("SpaceProbe Communicating");
    }

    @Override
    public void receiveCommand() {
        System.out.println("SpaceProbe Receiving Command");
    }

    @Override
    public void sendTelemetry() {
        System.out.println("SpaceProbe Sending Telemetry");
    }
}