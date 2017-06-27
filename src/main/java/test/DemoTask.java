package test;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xianbin on 2017/6/23.
 */
public class DemoTask implements Runnable {

    // Atomic integer containing the next thread ID to be assigned
    private static final AtomicInteger nextId = new AtomicInteger(0);

    // Thread local variable containing each thread's ID
    private static final ThreadLocal<Integer> threadId =
            new ThreadLocal<Integer>() {
                @Override
                protected Integer initialValue() {
                    return nextId.getAndIncrement();
                }
            };

    // Returns the current thread's unique ID, assigning it if necessary
    public int getThreadId() {
        return threadId.get();
    }

    // Returns the current thread's starting timestamp
    private static final ThreadLocal<Date> startDate =
            new ThreadLocal<Date>() {
                protected Date initialValue() {
                    return new Date();
                }
            };

    @Override
    public void run() {
        System.out.printf("Starting Thread: %s : %sn",
                getThreadId(), startDate.get());
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread Finished: %s : %sn",
                getThreadId(), startDate.get());
        System.out.println();
    }

    public static void main(String[] args) throws Exception{
        for (int i = 0; i <2 ; i++) {
            new Thread(new DemoTask()).start();
            Thread.sleep(2000);
        }
    }
}
