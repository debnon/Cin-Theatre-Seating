import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class customerTest {

    @Test
    public void customerInitTest() {
        Kiosk kiosk = new Kiosk();
        Customer customer = new Customer("James", kiosk);
        String customerID = customer.getCustomerID();

        Assertions.assertEquals("James", kiosk.getCustomer(customerID));
    }
}
