import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class kioskTest {

    Customer customer;
    Kiosk kiosk;


    @BeforeEach
    public void kioskInit() {
        kiosk = new Kiosk();
        customer = new Customer("James", kiosk);
        Theatre theatre1 = new Theatre(kiosk);
        theatre1.addMovie("Wallie");
    }

    @Test
    public void kioskCustomerIdTest() throws Exception {
        customer.orderTicket("Wallie");
        Assertions.assertEquals(customer.getCustomerID(), kiosk.getAllCustomerIDs().get(0));

        Customer customer2 = new Customer("Alice", kiosk);
        Assertions.assertEquals(customer2.getCustomerID(), kiosk.getAllCustomerIDs().get(1));
    }
}
