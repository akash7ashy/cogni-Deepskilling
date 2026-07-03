class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway payPalGateway;

    public PayPalAdapter() {
        payPalGateway = new PayPalGateway();
    }

    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}

class StripeAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StripeAdapter() {
        stripeGateway = new StripeGateway();
    }

    public void processPayment(double amount) {
        stripeGateway.pay(amount);
    }
}

public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(2500);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(4500);
    }
}
