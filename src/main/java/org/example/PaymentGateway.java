package org.example;

abstract class PaymentGateway {
    protected BankingSystem bankingSystem;

    public final boolean processPayment(PaymentRequest paymentRequest) {
        if (!validateRequest(paymentRequest)) {
            return false;
        }
        String transactionId = initiatePayment(paymentRequest);
        return confirmpayment(transactionId);
    }

    protected abstract boolean validateRequest(PaymentRequest paymentRequest);
    protected abstract boolean confirmpayment(String transactionId);
    protected abstract String initiatePayment(PaymentRequest paymentRequest);
}