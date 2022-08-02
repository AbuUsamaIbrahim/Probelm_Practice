package designPattern.singletonPattern;

public class SingletonMain {
    public static void main(String args[]){

        System.out.println(Singleton.getSingleton().hashCode());
        System.out.println(Singleton.getSingleton().hashCode());
    }
}
