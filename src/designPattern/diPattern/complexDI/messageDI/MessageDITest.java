package designPattern.diPattern.complexDI.messageDI;

import designPattern.diPattern.complexDI.messageDI.service.ConsumerService;
import designPattern.diPattern.complexDI.messageDI.service.InjectorService;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.MyDIApplication;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.injector.EmailServiceInjector;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.injector.SmsServiceInjector;

public class MessageDITest {
    public static void main(String [] args){
        String message = "Hi, This a message";
        String sender = "hasan@gmail.com";
        String phone = "01716558558";
        InjectorService injectorService = null;
        ConsumerService consumerService = null;

//        Email Send
        injectorService = new EmailServiceInjector();
        consumerService = injectorService.getConsumer();
        consumerService.processMessage(message,sender);

//        Sms Send
        injectorService = new SmsServiceInjector();
        consumerService = injectorService.getConsumer();
        consumerService.processMessage(message,phone);
    }
}
