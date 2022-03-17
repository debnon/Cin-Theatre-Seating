import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class theatreTest {

    Theatre theatre;

    @BeforeEach
    public void theatreInit() {
        Kiosk kiosk = new Kiosk();
        Customer customer = new Customer("Test", kiosk);
        theatre = new Theatre(kiosk);
        theatre.addMovie("Test Movie");
        theatre.addMovie("wallie");
    }

    @Test
    public void checkMovieInTheatre() {

        Assertions.assertEquals(true, theatre.checkMoviePresence("Test Movie"));
        Assertions.assertEquals(true, theatre.checkMoviePresence("wallie"));
    }

    @Test
    public void checkMovieNotInTheatre() {

        Assertions.assertEquals(false, theatre.checkMoviePresence("Not Test Movie"));
        Assertions.assertEquals(false, theatre.checkMoviePresence(""));
        Assertions.assertEquals(false, theatre.checkMoviePresence("test Movie"));
        Assertions.assertEquals(false, theatre.checkMoviePresence("Wallie"));
    }

}
