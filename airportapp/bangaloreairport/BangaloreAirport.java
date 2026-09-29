package com.xworkz.airportapp.bangaloreairport;

import com.xworkz.airportapp.airlines.Airline;

public class BangaloreAirport {

    private Airline[] airlines = new Airline[19];
    int index;

    public boolean addAirline(Airline airline) {

        boolean isAdded = false;
        boolean isAirlineIdValid = false;
        boolean isAirlineNameValid = false;
        boolean isDestinationValid = false;
        boolean isFlightCountValid = false;

        int airlineId = airline.getAirlineId();

        if (airlineId > 0) {
            isAirlineIdValid = true;
        } else {
            System.out.println("Airline Id is Invalid");
        }

        String airlineName = airline.getAirlineName();

        if (airlineName != null && !airlineName.isEmpty()) {
            isAirlineNameValid = true;
        } else {
            System.out.println("Airline Name is Invalid");
        }

        String destination = airline.getDestination();

        if (destination != null && !destination.isEmpty()) {
            isDestinationValid = true;
        } else {
            System.out.println("Destination is Invalid");
        }

        int flightCount = airline.getFlightCount();

        if (flightCount > 0) {
            isFlightCountValid = true;
        } else {
            System.out.println("Flight Count is Invalid");
        }

        if (isAirlineIdValid && isAirlineNameValid &&
                isDestinationValid && isFlightCountValid) {

            airlines[index++] = airline;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllAirlines() {

        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }
}