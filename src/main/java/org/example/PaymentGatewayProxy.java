package org.example;
//it uses the proxy pattern
public class PaymentGatewayProxy extends PaymentGateway{
    private PaymentGateway realPaymentGateway;

    public PaymentGatewayProxy(PaymentGateway realPaymentGateway){
        this.realPaymentGateway = realPaymentGateway;
    }
    @Override
    protected boolean validateRequest(PaymentRequest request) {
        System.out.println("[Proxy] Pre-validation logging...");
        boolean result = this.realPaymentGateway.validateRequest(request);
        System.out.println("[Proxy] Post-validation logging...");
        return result;
    }

    @Override
    protected String initiatePayment(PaymentRequest request) {
        System.out.println("[Proxy] Pre-initiation logging...");
        String result = this.realPaymentGateway.initiatePayment(request);
        System.out.println("[Proxy] Post-initiation logging...");
        return result;
    }

    @Override
    protected boolean confirmpayment(String transactionId) {
        System.out.println("[Proxy] Pre-confirmation logging...");
        boolean result = this.realPaymentGateway.confirmpayment(transactionId);
        System.out.println("[Proxy] Post-confirmation logging...");
        return result;
    }

}
