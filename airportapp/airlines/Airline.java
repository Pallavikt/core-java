package com.xworkz.airportapp.airlines;

public class Airline {

    private int airlineId;
    private String airlineName;
    private String destination;
    private int flightCount;

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(int flightCount) {
        this.flightCount = flightCount;
    }

    @Override
    public String toString() {
        return "Airline(airlineId = " + this.airlineId + ", airlineName = " + this.airlineName +
                ", destination = " + this.destination + ", flightCount = " + this.flightCount + ")";
    }
}
