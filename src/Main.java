import searchers.FlightSearcher;
import searchers.implementations.AmericaAirlinesSearcherImpl;
import searchers.implementations.TurkishAirLinesSearcherImpl;
import services.AdminTicketsService;

public class Main {
    public static void main(String[] args) {
        FlightSearcher amerfl = new AmericaAirlinesSearcherImpl();
        FlightSearcher turkichFl = new TurkishAirLinesSearcherImpl();
        FlightSearcher[] flightSearchers = {amerfl, turkichFl};
        AdminTicketsService adminTicketsService = new AdminTicketsService(flightSearchers);
        adminTicketsService.printAllFlight();

    }
}