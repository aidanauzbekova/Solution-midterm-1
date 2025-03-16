class PaymentAdapter implements PaymentMethod {
    private PaymentMethod paymentMethod;
    private ExternalPaymentGateway externalGateway;

    public PaymentAdapter(PaymentMethod method, ExternalPaymentGateway gateway) {
        this.paymentMethod = method;
        this.externalGateway = gateway;
    }

    public void processPayment(double amount) {
        if (externalGateway.validatePayment(amount)) {
            paymentMethod.processPayment(amount);
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed: Invalid transaction");
        }
    }
}