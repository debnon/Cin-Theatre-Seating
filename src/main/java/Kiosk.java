import java.util.HashMap;
import java.util.UUID;

public class Kiosk {

    public HashMap<String, HashMap> theatres;
    HashMap<String, HashMap<String, Integer>> customers = new HashMap<>();

    Kiosk() {

    }

    public String newCustomer(HashMap<String, Integer> tickets) {
        String CUST_ID = UUID.randomUUID().toString();
        customers.put(CUST_ID, tickets);
        return CUST_ID;
    }

    public HashMap<String, HashMap<String, Integer>> getAllCustomers() {
        return customers;
    }

    public HashMap<String, Integer> getCustomer(String CUST_ID) {
        return customers.get(CUST_ID);
    }

    public String addTheatre(Theatre theatre, HashMap movies) {
        String THEATRE_ID = UUID.randomUUID().toString();
        theatres.put(THEATRE_ID, movies);
        return THEATRE_ID;
    }

//    assignID(Customer customer) {
//
//    }
//
//    newOrder() {
//
//    }
//
//    public boolean checkCustomer() {
//        return
//    }



}
