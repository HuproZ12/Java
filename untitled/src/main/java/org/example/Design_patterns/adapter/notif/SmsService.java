package org.example.Design_patterns.adapter.notif;

public interface SmsService {
    void sendSms(String number, String message);
}