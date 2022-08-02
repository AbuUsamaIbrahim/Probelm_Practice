package designPattern.diPattern.complexDI.messageDI.service;

import designPattern.diPattern.complexDI.messageDI.Interface.Message;

public class SmsService implements Message {
    @Override
    public void sendMessage(String message, String sender) {
        System.out.println("Hello "+sender+"This the message from Sms Service - "+message);
    }
}
