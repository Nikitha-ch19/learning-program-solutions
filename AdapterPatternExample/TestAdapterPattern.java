public class TestAdapterPattern {
    public static void main(String[] args) {
        // Using PayPal
        PayPal paypal = new PayPal();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(1000);

        // Using Stripe
        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(2500);
    }
}
