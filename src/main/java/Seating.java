import java.util.ArrayList;
import java.util.HashMap;

public class Seating {

    private static final HashMap<Integer, String> seats = new HashMap<>();

    Seating() {
        constructSeating();
    }

    private void constructSeating() {

        Integer i = 0;
        while (i < 15) {

            if (i < 5) {
                seats.put(i, "A" + (i + 1));
            } else if (i < 10) {
                seats.put(i, "B" + (i % 5 + 1));
            } else {
                seats.put(i, "C" + (i % 10 + 1));
            }

            i++;
        }
    }

    public static HashMap<Integer, String> getSeats() {
        return seats;
    }

    public static ArrayList<String> requestSeats(Integer seatNumber, Integer ticketCount) {

        ArrayList<String> designatedSeats = new ArrayList<>();
        while (ticketCount > 0) {
            designatedSeats.add(seats.get(seatNumber));
            ticketCount--;
            seatNumber++;
        }

        return designatedSeats;
    }




}
