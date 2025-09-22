package org.example;
//Factory Method Pattern
 class GatewayFactory {
    public static PaymentGateway getPaymentGateway(GatewayType type) {
        switch (type) {
            case PAYTM:
                return new PaytmGateway();
            case RAZORPAY:
                return new RazorpayGateway();
            default:
                throw new IllegalArgumentException("Unknown gateway type");
        }
    }
}
