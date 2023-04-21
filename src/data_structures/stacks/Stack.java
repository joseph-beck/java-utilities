package data_structures.stacks;

import java.util.ArrayList;

public class Stack<T> {
    
    private int size;
    private int top = -1;
    private ArrayList<T> queue;

    public Stack(int size) {
        this.size = size;
        this.queue = new ArrayList<T>(size);
    }

    public void push(T item) {
        if (isFull()) return;

        top++;
        queue.add(top, item);
    }   
    
    public T pop() {
        if (isEmpty()) return null;

        T item = queue.get(top);
        queue.remove(top);
        top--;

        return item;
    }

    public T top() {
        if (isEmpty()) return null;

        return queue.get(top);
    }

    public boolean isEmpty() {
        if (top == -1) return true;

        return false;
    }

    public boolean isFull() {
        if (top == size - 1) return true;

        return false;
    }

    @Override
    public String toString() {
        String output = "";

        for (T item : queue) {
            if (item != null) output += item + "\n";
        }

        return output;
    }
}
