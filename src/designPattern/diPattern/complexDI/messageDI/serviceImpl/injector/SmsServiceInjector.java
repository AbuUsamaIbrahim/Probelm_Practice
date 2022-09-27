package designPattern.diPattern.complexDI.messageDI.serviceImpl.injector;

import designPattern.diPattern.complexDI.messageDI.service.ConsumerService;
import designPattern.diPattern.complexDI.messageDI.service.InjectorService;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.MyDIApplication;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.SmsServiceImpl;

public class SmsServiceInjector implements InjectorService {
    @Override
    public ConsumerService getConsumer() {
        return (new MyDIApplication(new SmsServiceImpl()));
    }
}
