package com.sumanth.learnings.multithreading;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    
    public static void main (String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        // Submit tasks to the executor
        for (int i = 0; i < 10; i++) {
            executor.submit(new Task(i));
        }
        
    }
}


class Task implements Runnable {
    private int taskId;
    
    public Task (int id) {
        this.taskId = id;
    }
    
    @Override
    public void run ( ) {
        for(Integer i=0;i<100000;i++){
         var a = 2+2;
        }
        System.out.println("Task " + taskId + " is executing by " + Thread.currentThread().getName() + " at " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS")));
    }
}
