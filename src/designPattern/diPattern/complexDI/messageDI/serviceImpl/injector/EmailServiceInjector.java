package designPattern.diPattern.complexDI.messageDI.serviceImpl.injector;

import designPattern.diPattern.complexDI.messageDI.service.ConsumerService;
import designPattern.diPattern.complexDI.messageDI.service.InjectorService;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.EmailServiceImpl;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.MyDIApplication;

import java.util.function.Consumer;

public class EmailServiceInjector implements InjectorService {
    @Override
    public ConsumerService getConsumer() {
        MyDIApplication application = new MyDIApplication();
        application.setMessage(new EmailServiceImpl());
        return application;
//        return (new MyDIApplication(new EmailServiceImpl()));
    }
}
