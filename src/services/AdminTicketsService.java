package services;

import searchers.FlightSearcher;

import java.util.Arrays;

public class AdminTicketsService {
    private FlightSearcher[] flightSearchers;

    public AdminTicketsService(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public FlightSearcher[] getFlightSearchers() {
        return flightSearchers;
    }

    public void setFlightSearchers(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public void printAllFlight() {
        for (FlightSearcher fl : flightSearchers) {
            System.out.println(Arrays.toString(fl.getAllAvailableFlights()));
        }
    }


}
