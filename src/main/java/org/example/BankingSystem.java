package org.example;
//template method pattern for fund transfers
abstract class BankingSystem {
    public void processfundtrasnfer(double amt,String toAccount){
        System.out.println("BankingSystem: Processing fund transfer of " + amt + " to " + toAccount);
        //in a real system there would be a template method structure
        //eg:validate,debit,credit steps
    }

}
