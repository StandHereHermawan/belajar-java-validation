package ariefbelajar.java.validation;

import ariefbelajar.java.validation.group.CreditCardPaymentGroup;
import ariefbelajar.java.validation.group.VirtualAccountPaymentGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

public class Payment {

    @NotBlank(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
            message = "orderid must not blank")
    private String orderId;

    @Range(groups = {CreditCardPaymentGroup.class, VirtualAccountPaymentGroup.class},
            min = 10_000L, max = 100_000_000L, message = "amount must between 10_000 and 100_000_000")
    @NotNull(message = "amount must noy null")
    private Long amount;

    @LuhnCheck(groups = {CreditCardPaymentGroup.class},
            message = "invalid credit card number")
    @NotBlank(message = "credit card must not blank")
    private String creditCard;

    @NotBlank(groups = {VirtualAccountPaymentGroup.class},
            message = "virtual account must not blank")
    private String virtualAccount;

    @Override
    public String toString() {
        return "Payment{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", creditCard='" + creditCard + '\'' +
                ", virtualAccount='" + virtualAccount + '\'' +
                '}';
    }

    public String getVirtualAccount() {
        return virtualAccount;
    }

    public void setVirtualAccount(String virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}
