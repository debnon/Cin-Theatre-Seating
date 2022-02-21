import java.util.ArrayList;
import java.util.HashMap;

public class Seating {

    private static final HashMap<Integer, String> seats = new HashMap<>();

    Seating() {
        constructSeating();
    }

    private void constructSeating() {

        Integer i = 1;
        while (i <= 15) {
            if (i <= 5) {
                seats.put(i, "A" + i);
            } else if (i <= 10) {
                seats.put(i % 5, "A" + i % 5);
            } else {
                seats.put(i % 10, "A" + i % 10);
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
