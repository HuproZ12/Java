package org.example.Design_patterns.adapter.notif;

public class EmailService {
    public void sendEmail(String email, String subject, String body){
        System.out.printf("Envoyé à : %s\n", email);
        System.out.printf("Objet : %s\n", subject);
        System.out.printf("Message : %s\n", body);
    }
}