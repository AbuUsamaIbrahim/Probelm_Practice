package designPattern.diPattern.complexDI.messageDI.serviceImpl.injector;

import designPattern.diPattern.complexDI.messageDI.service.InjectorService;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.EmailServiceImpl;
import designPattern.diPattern.complexDI.messageDI.serviceImpl.MyDIApplication;

import java.util.function.Consumer;

public class EmailInjector implements InjectorService {
    @Override
    public Consumer getConsumer() {
        return (new MyDIApplication(new EmailServiceImpl()));
    }
}
