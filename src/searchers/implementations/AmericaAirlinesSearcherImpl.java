package searchers.implementations;

import models.Ticket;
import searchers.FlightSearcher;

public class AmericaAirlinesSearcherImpl  implements FlightSearcher {
    @Override
    public Ticket[] getAllAvailableFlights() {
        String URL = "http://americaairlines.com/find";
        System.out.println("Обращаюсь на сайт"+ URL);
        Ticket[] ticket1 = new Ticket[2];
        ticket1[0] = new Ticket(1, "Rome-Paris", 700);
        ticket1[1] = new Ticket(2,"Madrid-Kyev", 300);
        convertFromCSV(ticket1);
        return ticket1;
    }

    @Override
    public boolean bookTicket(int id) {
        System.out.println("Выполняю фоновую проверку документов...");
        Ticket[] ticket2 = getAllAvailableFlights();
        for (Ticket it : ticket2) {
            if (it.getId() == id) {
                System.out.println("Билет забронирован...");
                return true;
            }
        }
        return false;
    }

    private void convertFromCSV(Ticket[] tickets){
        System.out.println("Я конвертирую данные из формата CSV...");
    }
}
