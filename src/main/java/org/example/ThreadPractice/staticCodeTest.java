package org.example.ThreadPractice;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/20/15:37
 */
public class staticCodeTest {

}

/**
 * 静态代码块 --> 构造代码块 --> 构造函数
 */
class test1 {
    static {
        System.out.println("test1:static代码块");
    }
    {
        System.out.println("test1:构造代码块");
    }
    test1(){
        System.out.println("test1:构造方法");
    }

    public static void main(String[] args) {
        System.out.println("test1:main方法");
        new test2();
    }
}
class test2 extends test1{
    static {
        System.out.println("test2:static代码块");
    }
    {
        System.out.println("test2:构造代码块");
    }
    test2(){
        System.out.println("test2:构造方法");
    }
    public static void main(String[] args) {
        System.out.println("test2:main函数");
        new test2();
    }
}
