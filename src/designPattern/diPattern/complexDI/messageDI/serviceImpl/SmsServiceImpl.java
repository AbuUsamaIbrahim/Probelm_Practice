package designPattern.diPattern.complexDI.messageDI.serviceImpl;

import designPattern.diPattern.complexDI.messageDI.service.MessageService;

public class SmsServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String sender) {
        System.out.println("Hello "+sender+" This the message from Sms Service - "+message);
    }
}
