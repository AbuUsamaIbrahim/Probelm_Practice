package designPattern.diPattern.complexDI.messageDI.serviceImpl;

import designPattern.diPattern.complexDI.messageDI.service.ConsumerService;
import designPattern.diPattern.complexDI.messageDI.service.MessageService;

public class MyDIApplication implements ConsumerService {
    private MessageService message;
    public MyDIApplication(){}
    public MyDIApplication(MessageService service){
        this.message = service;
    }
    public void setMessage(MessageService service){
        this.message = service;
    }
    @Override
    public void processMessage(String message, String sender) {
        this.message.sendMessage(message,sender);
    }
}
