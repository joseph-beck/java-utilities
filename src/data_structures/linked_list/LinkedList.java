package data_structures.linked_list;

import java.util.List;

public class LinkedList<T> {
    
    private SingleNode<T> head;

    public LinkedList(T[] data) {
        generate(data);
    }

    public LinkedList(List<T> data) {
       generate(data); 
    }

    public LinkedList() {
        this.head = null;
    }

    private void generate(T[] data) {
        if (data.length == 0) return;

        SingleNode<T> cursor = new SingleNode<T>();
        cursor.setNext(new SingleNode<T>(data[0]));
        head = cursor;

        for (int i = 1; i < data.length; i++) {
            cursor = cursor.getNext();
            cursor.setNext(new SingleNode<T>(data[i]));
        }
    }

    private void generate(List<T> data) {
        if (data.size() == 0) return;

        SingleNode<T> cursor = new SingleNode<T>();
        cursor.setNext(new SingleNode<T>(data.get(0)));
        head = cursor;

        for (int i = 1; i < data.size(); i++) {
            cursor = cursor.getNext();
            cursor.setNext(new SingleNode<T>(data.get(i)));
        }
    }

    public int size() {
        SingleNode<T> cursor = head;
        int size = 0;

        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
            size++;
        }
        return size;
    }

    public boolean contains(T value) {
        if (isEmpty()) return false;

        SingleNode<T> cursor = head.getNext();
        while (cursor != null) {
            if (cursor.getValue() == value) return true;
        }
        return false;
    }

    public T get(int index) {
        if (index > size() - 1) return null;

        SingleNode<T> cursor = head;
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        return cursor.getValue();
    }

    public void set(T value, int index) {
        if (index > size() - 1) return;

        SingleNode<T> cursor = head;
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        cursor.setValue(value);
    }

    public void push(T value) {
        head.setValue(value);
        SingleNode<T> first = head;
        head = new SingleNode<T>(first);
    }

    public void append(T value) {
        SingleNode<T> cursor = head;

        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        cursor.setNext(new SingleNode<T>(value));
    }

    public void insert(T value, int index) { // doesn't work
        if (index > size() - 1) return;

        SingleNode<T> cursor = head;
        SingleNode<T> next = getNode(index);
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        cursor.set(new SingleNode<T>(value, next));
    }

    public void print() {
        SingleNode<T> cursor = head.getNext();

        while (cursor != null) { ;
            System.out.printf(
                "%s%s", 
                cursor.getValue(), 
                (cursor.getNext() == null) ? "\n" : ", "
            );
            cursor = cursor.getNext();
        }
    }

    private SingleNode<T> getNode(int index) {
        if (index > size() - 1) return null;

        SingleNode<T> cursor = head;
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        return cursor.copy();
    }

    public boolean isEmpty() {
        return (head == null || head.getNext() == null);
    }

    @Override
    public String toString() {
        SingleNode<T> cursor = head.getNext();
        String string = "[";

        while (cursor != null) { ;
            string += String.format(
                "%s%s", 
                cursor.getValue(), 
                (cursor.getNext() == null) ? "" : ", "
            );
            cursor = cursor.getNext();
        }
        return string += "]\n";
    }
} 
