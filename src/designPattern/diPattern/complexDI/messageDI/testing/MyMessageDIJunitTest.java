package designPattern.diPattern.complexDI.messageDI.testing;

import designPattern.diPattern.complexDI.messageDI.service.ConsumerService;
import designPattern.diPattern.complexDI.messageDI.service.InjectorService;
import designPattern.diPattern.complexDI.messageDI.service.MessageService;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.MyDIApplication;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.SmsServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMessageDIJunitTest {
    private InjectorService injectorService;

    @Before
    public void setUp(){
        injectorService = new InjectorService() {
            @Override
            public ConsumerService getConsumer() {
                return new MyDIApplication(new MessageService() {
                    @Override
                    public void sendMessage(String message, String sender) {
                        System.out.println("This is a testing........");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        ConsumerService consumerService = injectorService.getConsumer();
        consumerService.processMessage("Test Message. ","hello@gmail.com");
    }

    @After
    public void tear(){
        injectorService = null;
        System.out.println("Test Finished");
    }
}
