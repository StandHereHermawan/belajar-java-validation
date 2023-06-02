package ariefbelajar.java.validation;

import ariefbelajar.java.validation.group.CreditCardPaymentGroup;
import org.junit.jupiter.api.Test;

public class ConstraintCompositionTest extends AbstractValidatorTest {

    @Test
    void testCompositionTest() {

        Payment payment = new Payment();
        payment.setOrderId("932843476397639774379sdiojsdjioiosdjsidj");
        payment.setCreditCard("");
        payment.setAmount(10L);

        validateWithGroups(payment, CreditCardPaymentGroup.class);

    }
}
