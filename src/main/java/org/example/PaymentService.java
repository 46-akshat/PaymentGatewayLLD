package org.example;

public class PaymentService {
    public boolean doPayment(GatewayType gatewayType, PaymentRequest request, BankingSystem bankingSystem) {
        System.out.println("\n--- PaymentService: Processing payment via " + gatewayType + " ---");

        // 1. Get the correct gateway from the factory
        PaymentGateway gateway = GatewayFactory.getPaymentGateway(gatewayType);

        // 2. Associate the banking system with it
        gateway.bankingSystem = bankingSystem;

        // 3. Execute the payment process
        boolean result = gateway.processPayment(request);

        System.out.println("--- PaymentService: Finished with result: " + (result ? "SUCCESS" : "FAILURE") + " ---");
        return result;
    }
}
