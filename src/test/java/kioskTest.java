import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class kioskTest {

    @Test
    public void kioskInitTest() throws Exception {
        Kiosk kiosk = new Kiosk();
        Customer customer = new Customer("James", kiosk);
        Theatre theatre1 = new Theatre(kiosk);
        theatre1.addMovie("Wallie");

        customer.orderTicket("Wallie");
        String customerID = customer.getCustomerID();

        Assertions.assertEquals("Wallie", kiosk.getCustomer(customerID));
    }
}
