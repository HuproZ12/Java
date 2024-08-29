package org.example.Design_patterns.adapter.paiement;

public class PaymentAdapter implements OldPaymentGateway {
    public NewPaymentProcessor processor;

    public PaymentAdapter(){
        processor = new NewPaymentProcessor();
    }

    @Override
    public void makePayment(String accountNumber, double amount){
        processor.authenticate(accountNumber);
        processor.sendPayment(amount);
    }
}