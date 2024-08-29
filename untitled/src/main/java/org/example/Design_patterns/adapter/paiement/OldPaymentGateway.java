package org.example.Design_patterns.adapter.paiement;

public interface OldPaymentGateway {
    void makePayment(String accountNumber, double amount);
}