import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class customerTest {

    Kiosk kiosk;
    Customer customer;

    @BeforeEach
    public void customerInit() {
        kiosk = new Kiosk();
        customer = new Customer("James", kiosk);
    }

    @Test
    public void customerInitTest() {

        Assertions.assertEquals("James", customer.getCustomerName());
    }

    @Test
    public void checkTicketsTest() throws Exception {
        Theatre theatre1 = new Theatre(kiosk);
        theatre1.addMovie("Wallie");

        customer.orderTicket("Wallie");
        customer.orderTicket("Wallie");

        Assertions.assertEquals("A1", customer.checkCustomerSeats("Wallie").get(0));
        Assertions.assertEquals("A2", customer.checkCustomerSeats("Wallie").get(1));
    }

    @Test
    public void checkTicketsForMultipleMoviesTest() throws Exception {
        Theatre theatre1 = new Theatre(kiosk);
        theatre1.addMovie("Wallie");
        theatre1.addMovie("Bambi");

        customer.orderTicket("Wallie");
        customer.orderTicket("Bambi");

        Assertions.assertEquals("A1", customer.checkCustomerSeats("Wallie").get(0));
        Assertions.assertEquals("A1", customer.checkCustomerSeats("Bambi").get(0));
    }

    @Test
    public void checkTicketsForMultipleCustomersTest() throws Exception {
        Customer customer2 = new Customer("Alice", kiosk);
        Theatre theatre1 = new Theatre(kiosk);
        theatre1.addMovie("Wallie");


        customer.orderTicket("Wallie");
        customer2.orderTicket("Wallie");

        Assertions.assertEquals("A1", customer.checkCustomerSeats("Wallie").get(0));

        Integer customerTickets = customer.checkCustomerSeats("Wallie").size();
        String customer2Seat = "A2";
        if (customerTickets > 2) {
            customer2Seat = "A4";
        } else if (customerTickets > 1) {
            customer2Seat = "A3";
        }
        Assertions.assertEquals(customer2Seat, customer2.checkCustomerSeats("Wallie").get(0));
    }
}
