package com.queue;

public class MyQueue {

    Node front = null;
    Node rear = null;
    int currentSize = 0;

    public boolean isEmpty() {
        return (currentSize == 0);
    }
    public void enQueue(int data){
        Node oldRear = rear;
        rear = new Node(data);
        rear.data = data;
        rear.next = null;

        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }
    public void deQueue(){
        int data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        currentSize--;
        System.out.println(data + " removed from the queue");
    }
}
