package org.example.Design_patterns.adapter.paiement;

public class NewPaymentProcessor {
    public void authenticate(String apiKey){
        System.out.println("Authenticating with API Key: " + apiKey);
    }

    public void sendPayment(double amount){
        System.out.println("Sending payment: " + amount);
    }
}