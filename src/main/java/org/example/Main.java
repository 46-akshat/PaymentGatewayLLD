package org.example;

public class Main {
    public static void main(String[] args) {

        // Create the PaymentController and PaymentService objects
        //PaymentController paymentController = new PaymentController(null); // Temporarily pass null
        PaymentService paymentService = new PaymentService();
        PaymentController paymentController = new PaymentController(paymentService);
        paymentController.setPaymentService(paymentService); // Inject the dependency

        Client client = new Client(paymentController);

        // Banking systems to use
        BankingSystem rzpBank = new RazorpayBankingSystem();
        BankingSystem paytmBank = new HDFCBankingSystem();

        System.out.println("--- Starting Payment 1 (Razorpay) ---");
        PaymentRequest request2 = new PaymentRequest();
        request2.setAmount(4200.50);
        client.makePayment(GatewayType.RAZORPAY, request2, rzpBank);
        System.out.println("--- Payment 1 Finished ---\n");

        System.out.println("--- Starting Payment 2 (Paytm) ---");
        PaymentRequest request3 = new PaymentRequest();
        request3.setAmount(999.0);
        client.makePayment(GatewayType.PAYTM, request3, paytmBank);
        System.out.println("--- Payment 2 Finished ---\n");
    }
}