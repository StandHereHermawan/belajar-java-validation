package ariefbelajar.java.validation;

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
}
