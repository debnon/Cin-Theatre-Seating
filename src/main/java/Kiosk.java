import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Kiosk {

    public ArrayList<Theatre> theatres = new ArrayList<>();
    HashMap<String, HashMap<String, ArrayList<String>>> customers = new HashMap<>();

    Kiosk() {

    }

    public String newCustomer(HashMap<String, ArrayList<String>> tickets) {
        String CUST_ID = UUID.randomUUID().toString();
        customers.put(CUST_ID, tickets);
        return CUST_ID;
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> getAllCustomers() {
        return customers;
    }

    public HashMap<String, ArrayList<String>> getCustomer(String CUST_ID) {
        return customers.get(CUST_ID);
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }

    public ArrayList<String> newOrder(String movieName, Integer ticketCount) throws Exception {
        for (Theatre theatre : theatres) {
            if (theatre.checkMoviePresence(movieName)) {
                return theatre.assignSeats(movieName, ticketCount);
            }
        }

        throw new RuntimeException("That film isn't available");
    }







}
