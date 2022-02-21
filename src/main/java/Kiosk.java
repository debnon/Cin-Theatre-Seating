import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Kiosk {

    public ArrayList<Theatre> theatres = new ArrayList<>();
    public ArrayList<String> customers = new ArrayList<>();

    Kiosk() {

    }

    public String newCustomer(HashMap<String, ArrayList<String>> tickets) {
        String CUST_ID = UUID.randomUUID().toString();
        customers.add(CUST_ID);
        return CUST_ID;
    }

    public ArrayList<String> getAllCustomerIDs() {
        return customers;
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }

    public ArrayList<Theatre> getAllTheatres() {
        return theatres;
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
