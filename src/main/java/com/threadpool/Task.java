package com.threadpool;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getThreadGroup().getName() + "  " + Thread.currentThread().getName() + "  " + Thread.currentThread().getId());
    }
}
