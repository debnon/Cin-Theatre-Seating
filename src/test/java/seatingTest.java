import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class seatingTest {

    @Test
    public void seatingInit() {
        Seating seating = new Seating();
        Assertions.assertEquals("A1", seating.getSeats().get(1));
    }
}
