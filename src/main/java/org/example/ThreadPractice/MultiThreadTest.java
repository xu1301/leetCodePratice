package org.example.ThreadPractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/22/9:36
 */
public class MultiThreadTest implements Callable<String> {
    public void test () {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,3000, TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<>(), new ThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MultiThreadTest multiThreadTest = new MultiThreadTest("thread1");
        MultiThreadTest multiThreadTest2 = new MultiThreadTest("thread2");
        FutureTask<String> futureTask = new FutureTask<>(multiThreadTest);
        FutureTask<String> futureTask2 = new FutureTask<>(multiThreadTest2);
        new Thread(futureTask).start();
        new Thread(futureTask2).start();
        String result1 = futureTask.get();
        String result2 = futureTask2.get();
        System.out.println(result1);
        System.out.println(result2);
    }
    MultiThreadTest(String name ) {
        this.name = name;
    }
    private String name = "thread";
    @Override
    public String call() throws InterruptedException {
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.println(name + "当前数量为：" + i);
            Thread.sleep(1000);
        }
        return name + "结束";
    }
}
