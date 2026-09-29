package com.xworkz.airportapp;


import com.xworkz.airportapp.airlines.Airline;
import com.xworkz.airportapp.bangaloreairport.BangaloreAirport;

public class BangaloreAirportRunner {

    public static void main(String[] args) {

        BangaloreAirport airport = new BangaloreAirport();

        Airline airline = new Airline();
        airline.setAirlineId(1);
        airline.setAirlineName("IndiGo");
        airline.setDestination("Delhi");
        airline.setFlightCount(25);
        airport.addAirline(airline);

        Airline airline1 = new Airline();
        airline1.setAirlineId(2);
        airline1.setAirlineName("Air India");
        airline1.setDestination("Mumbai");
        airline1.setFlightCount(18);
        airport.addAirline(airline1);

        Airline airline2 = new Airline();
        airline2.setAirlineId(3);
        airline2.setAirlineName("Akasa Air");
        airline2.setDestination("Pune");
        airline2.setFlightCount(12);
        airport.addAirline(airline2);

        Airline airline3 = new Airline();
        airline3.setAirlineId(4);
        airline3.setAirlineName("SpiceJet");
        airline3.setDestination("Hyderabad");
        airline3.setFlightCount(10);
        airport.addAirline(airline3);

        Airline airline4 = new Airline();
        airline4.setAirlineId(5);
        airline4.setAirlineName("Emirates");
        airline4.setDestination("Dubai");
        airline4.setFlightCount(8);
        airport.addAirline(airline4);

        Airline airline5 = new Airline();
        airline5.setAirlineId(6);
        airline5.setAirlineName("Qatar Airways");
        airline5.setDestination("Doha");
        airline5.setFlightCount(7);
        airport.addAirline(airline5);

        Airline airline6 = new Airline();
        airline6.setAirlineId(7);
        airline6.setAirlineName("Singapore Airlines");
        airline6.setDestination("Singapore");
        airline6.setFlightCount(6);
        airport.addAirline(airline6);

        Airline airline7 = new Airline();
        airline7.setAirlineId(8);
        airline7.setAirlineName("British Airways");
        airline7.setDestination("London");
        airline7.setFlightCount(5);
        airport.addAirline(airline7);

        Airline airline8 = new Airline();
        airline8.setAirlineId(9);
        airline8.setAirlineName("Lufthansa");
        airline8.setDestination("Frankfurt");
        airline8.setFlightCount(5);
        airport.addAirline(airline8);

        Airline airline9 = new Airline();
        airline9.setAirlineId(10);
        airline9.setAirlineName("Thai Airways");
        airline9.setDestination("Bangkok");
        airline9.setFlightCount(6);
        airport.addAirline(airline9);

        Airline airline10 = new Airline();
        airline10.setAirlineId(11);
        airline10.setAirlineName("Etihad Airways");
        airline10.setDestination("Abu Dhabi");
        airline10.setFlightCount(7);
        airport.addAirline(airline10);

        Airline airline11 = new Airline();
        airline11.setAirlineId(12);
        airline11.setAirlineName("Malaysia Airlines");
        airline11.setDestination("Kuala Lumpur");
        airline11.setFlightCount(4);
        airport.addAirline(airline11);

        Airline airline12 = new Airline();
        airline12.setAirlineId(13);
        airline12.setAirlineName("SriLankan Airlines");
        airline12.setDestination("Colombo");
        airline12.setFlightCount(5);
        airport.addAirline(airline12);

        Airline airline13 = new Airline();
        airline13.setAirlineId(14);
        airline13.setAirlineName("Air France");
        airline13.setDestination("Paris");
        airline13.setFlightCount(4);
        airport.addAirline(airline13);

        Airline airline14 = new Airline();
        airline14.setAirlineId(15);
        airline14.setAirlineName("KLM Royal Dutch Airlines");
        airline14.setDestination("Amsterdam");
        airline14.setFlightCount(3);
        airport.addAirline(airline14);

        Airline airline15 = new Airline();
        airline15.setAirlineId(16);
        airline15.setAirlineName("Japan Airlines");
        airline15.setDestination("Tokyo");
        airline15.setFlightCount(3);
        airport.addAirline(airline15);

        Airline airline16 = new Airline();
        airline16.setAirlineId(17);
        airline16.setAirlineName("Oman Air");
        airline16.setDestination("Muscat");
        airline16.setFlightCount(5);
        airport.addAirline(airline16);

        Airline airline17 = new Airline();
        airline17.setAirlineId(18);
        airline17.setAirlineName("Saudia");
        airline17.setDestination("Jeddah");
        airline17.setFlightCount(4);
        airport.addAirline(airline17);

        Airline airline18 = new Airline();
        airline18.setAirlineId(19);
        airline18.setAirlineName("Nepal Airlines");
        airline18.setDestination("Kathmandu");
        airline18.setFlightCount(3);
        airport.addAirline(airline18);

        airport.getAllAirlines();
    }
}