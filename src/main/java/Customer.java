// rows A - C, columns (seats) 1 - 5

// customer requests 1 - 3 tickets corresponding to particular seats for a movie
// customer is allocated appropriate seats from the seating plan
// seats recorded as allocated

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {

    private String NAME;
    private String CUST_ID;
    private final Kiosk kiosk;
    public HashMap<String, ArrayList<String>> tickets = new HashMap<>();

    Customer(String name, Kiosk kiosk) {
        this.kiosk = kiosk;
        this.NAME = name;
        this.CUST_ID = kiosk.newCustomer(tickets);
    }

    public String getCustomerID() {
        return CUST_ID;
    }

    public String getCustomerName() {
        return NAME;
    }

    public void orderTicket(String movieName) throws Exception {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
        ArrayList<String> newTickets = kiosk.newOrder(movieName, randomNum);
        tickets.put(movieName, newTickets);
    }

    public void checkCustomerSeats() {

    }

  //    newOrder(String movieName) {
  //        kiosk.findMovie();
  //    }
//  public Object[] getCustomerID() {
//      return new Object[]{NAME, CUST_ID};
//  }
}
