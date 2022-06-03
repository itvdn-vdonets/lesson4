package searchers;

import models.Ticket;

public interface FlightSearcher {
    Ticket[] getAllAvailableFlights();
    boolean bookTicket(int id);

}
