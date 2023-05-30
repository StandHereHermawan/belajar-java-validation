package ariefbelajar.java.validation;

import ariefbelajar.java.validation.group.PaymentGroup;
import org.junit.jupiter.api.Test;

public class GroupSequenceTest extends AbstractValidatorTest{

    @Test
    void testGroupSequenceCreditCardFail() {

        Payment payment = new Payment();
        payment.setAmount(10_000_000L);
        payment.setOrderId("0001");
        payment.setCreditCard("4111");

        validateWithGroups(payment, PaymentGroup.class);


    }

    @Test
    void testGroupSequenceVirtualAccountFail() {

        Payment payment = new Payment();
        payment.setAmount(10_000_000L);
        payment.setOrderId("0001");
        payment.setCreditCard("4111111111111111");

        validateWithGroups(payment, PaymentGroup.class);

    }
}
