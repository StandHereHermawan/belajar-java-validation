package ariefbelajar.java.validation;

import ariefbelajar.java.validation.group.PaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupConvertTest extends AbstractValidatorTest {

    @Test
    void testGroupConvert() {

        Payment payment = new Payment();
        payment.setAmount(10_000_000L);
        payment.setOrderId("0001");
        payment.setCreditCard("4111111111111111");
        payment.setCustomer(new Customer());

        validateWithGroups(payment, PaymentGroup.class);

    }
}
