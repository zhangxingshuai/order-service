package com.threadpool;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;
import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;

import java.io.IOException;

public class MyThreadPool implements ThreadPool {
    @Override
    public WorkQueue getAnyWorkQueue() {
        return null;
    }

    @Override
    public WorkQueue getWorkQueue(int queueId) throws NoSuchWorkQueueException {
        return null;
    }

    @Override
    public int numberOfWorkQueues() {
        return 0;
    }

    @Override
    public int minimumNumberOfThreads() {
        return 0;
    }

    @Override
    public int maximumNumberOfThreads() {
        return 0;
    }

    @Override
    public long idleTimeoutForThreads() {
        return 0;
    }

    @Override
    public int currentNumberOfThreads() {
        return 0;
    }

    @Override
    public int numberOfAvailableThreads() {
        return 0;
    }

    @Override
    public int numberOfBusyThreads() {
        return 0;
    }

    @Override
    public long currentProcessedCount() {
        return 0;
    }

    @Override
    public long averageWorkCompletionTime() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
