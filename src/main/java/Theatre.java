import java.util.ArrayList;
import java.util.HashMap;

public class Theatre {

    private Kiosk kiosk;
    private String THEATRE_ID;
    public HashMap<String, Integer> movies = new HashMap<>();

    Theatre(Kiosk kiosk) {
        movies = new HashMap<>();
        this.kiosk = kiosk;
        kiosk.addTheatre(this);
        // this.THEATRE_ID = kiosk.addTheatre(movies);
    }

    public ArrayList<String> assignSeats(String movieName, Integer ticketCount) throws Exception {
        if (movies.get(movieName) + ticketCount <= 15) {
            ArrayList<String> assignedSeats = Seating.requestSeats(movies.get(movieName), ticketCount);
            movies.put(movieName, movies.get(movieName) + ticketCount);
            return assignedSeats;
        } else {
            throw new RuntimeException("There are no more seats left!");
        }

    }

    public void addMovie(String movieName) {
        movies.put(movieName, 0);
    }

    public boolean checkMoviePresence(String movieName) {
        if (movies.get(movieName) != null) {
            return true;
        }
        return false;
    }


}
