import java.util.HashMap;

public class Seating {

    public HashMap<Integer, String> seats;

    Seating() {
        seats = new HashMap<>();
        constructSeating();
    }

    private void constructSeating() {
        System.out.println("seats");
        Integer i = 1;
        while (i <= 15) {

            if (i <= 5) {
                seats.put(i, "A" + i);
            } else if (i <= 10) {
                seats.put(i % 5, "A" + i % 5);
            } else {
                seats.put(i % 10, "A" + i % 10);
            }
            System.out.println(seats);
            i++;

        }
    }

    public HashMap<Integer, String> getSeats() {
        return seats;
    }
}
