package fun.gengzi.thread;


import java.util.concurrent.atomic.AtomicInteger;

public class MyRun {

    private AtomicInteger integer;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        Thread thread1 = new Thread();
        thread1.getName();
        thread1.join();
        String string = new String();
//        string.wait();
//        Integer integer = new Integer();
        System.out.println("");
        boolean interrupted = Thread.interrupted();

        ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>();
    }

}

