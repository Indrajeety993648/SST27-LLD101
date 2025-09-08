package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private String phoneNumber;

    public WhatsAppDecorator(Notifier notifier, String phoneNumber) {
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[WhatsApp -> " + phoneNumber + "]: " + text);
    }
}
