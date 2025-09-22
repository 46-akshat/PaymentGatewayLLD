package org.example;

public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean handlePayment(GatewayType gatewayType, PaymentRequest request, BankingSystem bankingSystem) {
        return paymentService.doPayment(gatewayType, request, bankingSystem);
    }
}