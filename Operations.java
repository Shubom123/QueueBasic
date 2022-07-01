package com.queue;

public class Operations {
    public static void actions(){
        MyQueue queue = new MyQueue();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println("Queue is deleted");
    }
}
