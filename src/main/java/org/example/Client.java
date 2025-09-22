package org.example;

public class Client {
    private final PaymentController paymentController;

    public Client(PaymentController paymentController) {
        this.paymentController = paymentController;
    }

    public void makePayment(GatewayType gatewayType, PaymentRequest request3, BankingSystem paytmbank) {
        boolean success=paymentController.handlePayment(gatewayType, request3, paytmbank);
        System.out.println("Final Payment Status: " + (success ? "SUCCESS" : "FAILURE"));
    }

}
