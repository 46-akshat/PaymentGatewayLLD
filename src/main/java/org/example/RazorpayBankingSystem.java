package org.example;

public class RazorpayBankingSystem extends BankingSystem {
    @Override
    public void processfundtrasnfer(double amt, String toAccount) {
        System.out.println("RazorpayBankingSystem: Processing fund transfer of " + amt + " to " + toAccount);
       //in real system we will have api calls to Razorpay
    }
}
