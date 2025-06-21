public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        context.makePayment(1500.00);

        context.setPaymentStrategy(new PayPalPayment("nikitha@example.com"));
        context.makePayment(2000.00);
    }
}
