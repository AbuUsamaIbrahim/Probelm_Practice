package coreJava.thread.multiThread;

public class ThreadCalling {
    public static void main(String[] args){
        System.out.println("Thread initializing.....");
        ThreadTesting testing1 = new ThreadTesting("Thread 1");
        testing1.start();
        ThreadTesting testing2 = new ThreadTesting("Thread 2");
        testing2.start();

    }
}
