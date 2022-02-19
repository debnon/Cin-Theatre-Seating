// rows A - C, columns (seats) 1 - 5

// customer requests 1 - 3 tickets corresponding to particular seats for a movie
// customer is allocated appropriate seats from the seating plan
// seats recorded as allocated

import java.util.HashMap;

public class Customer {

    private String NAME;
    private String CUST_ID;
    private final Kiosk kiosk;
    public HashMap<String, Integer> tickets;

    Customer(String name, Kiosk kiosk) {
        this.kiosk = kiosk;
        this.NAME = name;
        this.CUST_ID = kiosk.newCustomer(tickets);
    }

    public String getCustomerID() {
        return CUST_ID;
    }

  //    newOrder(String movieName) {
  //        kiosk.findMovie();
  //    }
//  public Object[] getCustomerID() {
//      return new Object[]{NAME, CUST_ID};
//  }
}
