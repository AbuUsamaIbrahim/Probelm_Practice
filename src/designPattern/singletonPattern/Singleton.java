package designPattern.singletonPattern;

public class Singleton {
    private Singleton(){}
    private  static Singleton singleton ;

    public static Singleton getSingleton() {
        if(singleton == null)
            return singleton = new Singleton();
        return singleton;
    }
}
