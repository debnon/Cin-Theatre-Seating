import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class customerTest {

    @Test
    public void customerInitTest() {
        Kiosk kiosk = new Kiosk();
        Customer customer = new Customer("James", kiosk);

        Assertions.assertEquals("James", customer.getCustomerName());
    }

    @Test
    public void checkTicketsTest() throws Exception {
        Kiosk kiosk = new Kiosk();
        Customer customer = new Customer("James", kiosk);
        Theatre theatre1 = new Theatre(kiosk);
        theatre1.addMovie("Wallie");

        customer.orderTicket("Wallie");


        Assertions.assertEquals("A1", customer.checkCustomerSeats("Wallie").get(0));
    }
}
