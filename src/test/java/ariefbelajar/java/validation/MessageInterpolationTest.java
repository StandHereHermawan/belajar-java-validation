package ariefbelajar.java.validation;

import ariefbelajar.java.validation.group.CreditCardPaymentGroup;
import ariefbelajar.java.validation.group.VirtualAccountPaymentGroup;
import org.junit.jupiter.api.Test;

public class MessageInterpolationTest extends AbstractValidatorTest{

    @Test
    void testMessage() {

        Payment payment = new Payment();
        payment.setOrderId("61534853856285468235823652");
        payment.setVirtualAccount("7832437");
        payment.setAmount(10L);

        validateWithGroups(payment, VirtualAccountPaymentGroup.class);
    }
    @Test
    void testMessageBlank() {

        Payment payment = new Payment();
        payment.setOrderId("");
        payment.setCreditCard("");
        payment.setAmount(null);

        validateWithGroups(payment, CreditCardPaymentGroup.class);
    }
}
