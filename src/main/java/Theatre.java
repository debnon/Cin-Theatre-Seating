import java.util.ArrayList;
import java.util.HashMap;

public class Theatre {

    private Kiosk kiosk;
    private Seating seating;
    private String THEATRE_ID;
    public HashMap<String, Integer> movies;

    Theatre(Kiosk kiosk) {
        this.kiosk = kiosk;
        // this.THEATRE_ID = kiosk.addTheatre(movies);
    }

//    public String assignSeats(String movieName, Integer ticketCount) {
//        if (movies.get(movieName) + ticketCount <= 15) {
//            ArrayList<String> assignedSeats = new ArrayList<String>();
//
//            movies.put(movieName, movies.get(movieName) + ticketCount);
//            return
//        }
//    }


}
