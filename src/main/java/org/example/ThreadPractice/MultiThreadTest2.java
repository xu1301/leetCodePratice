package org.example.ThreadPractice;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/8/1/15:59
 */
public class MultiThreadTest2 extends Thread{
    @Override
    public void run(){
        isInterrupted();
        interrupt();
    }
}
