package org.example;

public class HDFCBankingSystem extends BankingSystem{
    @Override
    public void processfundtrasnfer(double amt, String toAccount) {
        System.out.println("HDFCBankingSystem: Processing fund transfer of " + amt + " to " + toAccount);
      //in real system we will have api calls to HDFC bank
    }
}
