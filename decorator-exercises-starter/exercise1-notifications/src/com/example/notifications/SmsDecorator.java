package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private String phoneNumber;

    public SmsDecorator(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[SMS -> " + phoneNumber + "]: " + text);
    }
}
