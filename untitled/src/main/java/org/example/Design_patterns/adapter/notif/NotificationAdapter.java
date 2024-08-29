package org.example.Design_patterns.adapter.notif;

public class NotificationAdapter implements SmsService {
    public EmailService inst_email_service;

    public NotificationAdapter(){
        inst_email_service = new EmailService();
    }

    @Override
    public void sendSms(String number, String message){
        inst_email_service.sendEmail(number, "obj", message);
    }
}