package com.threadpool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
@Data
@NoArgsConstructor
public class MyThreadFactory implements ThreadFactory {
    private String groupName;
    private String prefix;
    private final AtomicInteger index = new AtomicInteger();

    public MyThreadFactory(String groupName, String prefix) {
        this.groupName = groupName;
        this.prefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        ThreadGroup group = new ThreadGroup(groupName);
        String threadName = prefix + "_" + index.getAndIncrement();
        Thread thread = new Thread(group, r, threadName);
        return thread;
    }
}
