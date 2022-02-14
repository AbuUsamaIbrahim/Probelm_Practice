package coreJava.thread.multiThread;

public class ThreadTesting implements Runnable {
    Thread mainThread;
    private String threadName;
    ThreadTesting(String name){
        threadName = name;
    }
    @Override
    public void run() {
        System.out.println("Thread is running "+threadName);
        for(int i=0; i<4;i++){
            System.out.println(i);
            System.out.println("Thread Name : "+threadName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
    }
    public void start(){
        System.out.println("Thread started");
        if(mainThread == null){
            mainThread = new Thread(this,threadName);
            mainThread.start();
        }


    }
}
