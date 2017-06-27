package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xianbin on 2017/6/23.
 */
public class ExecutorSample {
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void execute() {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous task excute "+Thread.currentThread().getName());
            }
        });
    }

    public static Future submit() {
        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous task submit");

            }
        });

        return future;
    }

    public static Future submitCallable() {
        Future future = executorService.submit(new Callable() {
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });
        return future;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i <20 ; i++) {
            execute();
        }
        /*System.out.println(submit().get());
        System.out.println(submitCallable().get());

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);

        futures.forEach(stringFuture -> {
            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });*/

        executorService.shutdown();
    }
}
