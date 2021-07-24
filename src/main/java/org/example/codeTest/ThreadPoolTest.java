package org.example.codeTest;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/22/17:39
 */
public class ThreadPoolTest extends ThreadPoolExecutor {
    ThreadPoolTest(int corePoolSize,
                   int maximumPoolSize,
                   long keepAliveTime,
                   TimeUnit unit,
                   BlockingQueue<Runnable> workQueue,
                   RejectedExecutionHandler handler) {
        super(corePoolSize,maximumPoolSize,keepAliveTime,unit,workQueue,handler);

    }
    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        System.out.println(t.getId() + "将要执行");
    }
    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        System.out.println(r.toString() + "执行完毕");
    }

    public static void main(String[] args) {
        ThreadPoolTest threadPoolTest = new ThreadPoolTest(5,10,3000, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(String.valueOf(i));
            threadPoolTest.submit(myThread);
            threadPoolTest.execute();
        }

    }

    static class MyThread implements Runnable{
        MyThread(String name) {
            this.name = name;
        }
        String name = "defaultThread";
        @Override
        public void run() {
            System.out.println(name+"在执行");
        }
    }
}
