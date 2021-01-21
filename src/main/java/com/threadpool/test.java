package com.threadpool;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10, new MyThreadFactory("线程组1", "订单线程"));
        ExecutorService exec2 = Executors.newFixedThreadPool(10, new MyThreadFactory("线程组2", "支付线程"));

        for (int i = 0; i < 100; i++) {
            exec.execute(new Task());
            Thread.sleep(500);
        }
    }
}
