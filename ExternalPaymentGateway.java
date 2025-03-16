interface ExternalPaymentGateway {
    boolean validatePayment(double amount);
}

class MockExternalGateway implements ExternalPaymentGateway {
    public boolean validatePayment(double amount) {
        return amount > 0;
    }
}
