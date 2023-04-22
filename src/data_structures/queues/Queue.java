package data_structures.queues;

import java.util.ArrayList;

public class Queue<T> {

    private int size;

    private int front;
    private int rear;
    private ArrayList<T> queue;
    
    public Queue(int size) {
        this.size = size;
        this.queue = new ArrayList<T>(size);
    }

    public void queue(T item) {
        if (isFull()) return;

        // change rear pointer
        queue.set(rear, item);
    }

    public T dequeue() {
        if (isEmpty()) return null;

        T item = queue.get(front);
        queue.remove(front);
        // work out new front logic
        return item;
    }

    public boolean isEmpty() {
        // check if empty

        return false;
    }

    public boolean isFull() {
        // check if full

        return false;
    }
}
