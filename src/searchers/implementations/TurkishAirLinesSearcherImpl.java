package searchers.implementations;

import models.Ticket;
import searchers.FlightSearcher;

public class TurkishAirLinesSearcherImpl implements FlightSearcher {
    @Override
    public Ticket[] getAllAvailableFlights() {
        String URL = "http://turkishairlines.com/find";
        System.out.println("Обращаюсь на сайт"+ URL);
        Ticket[] ticket1 = new Ticket[2];
        ticket1[0] = new Ticket(3, "Berlin - London", 100);
        ticket1[1] = new Ticket(4,"Lisabon - London", 400);
        convertFromJSON(ticket1);
        return ticket1;
    }

    @Override
    public boolean bookTicket(int id) {
        System.out.println("Выполняю визовую проверку...");
        Ticket[] ticket2 = getAllAvailableFlights();
        for (Ticket it : ticket2) {
            if (it.getId() == id) {
                System.out.println("Билет забронирован...");
                return true;
            }
        }
        return false;
    }

    private void convertFromJSON(Ticket[] tickets) {
        System.out.println("Конвертую із JSON");
    }
}
