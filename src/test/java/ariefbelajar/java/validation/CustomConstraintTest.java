package ariefbelajar.java.validation;

import ariefbelajar.java.validation.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class CustomConstraintTest extends AbstractValidatorTest {

    @Test
    void testCustomConstraint() {

        Payment payment = new Payment();
        payment.setOrderId("bruhh");
        payment.setAmount(10L);
        payment.setCreditCard("");

        validateWithGroups(payment, CreditCardPaymentGroup.class);

    }
}
