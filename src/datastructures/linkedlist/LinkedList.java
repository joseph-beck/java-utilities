package datastructures.linkedlist;

import java.util.List;

public class LinkedList<T> {
    
    private Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

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

        Node<T> cursor = new Node<T>();
        cursor.setNext(new Node<T>(data[0]));
        head = cursor;

        for (int i = 1; i < data.length; i++) {
            cursor = cursor.getNext();
            cursor.setNext(new Node<T>(data[i]));
        }
    }

    private void generate(List<T> data) {
        if (data.size() == 0) return;

        Node<T> cursor = new Node<T>();
        cursor.setNext(new Node<T>(data.get(0)));
        head = cursor;

        for (int i = 1; i < data.size(); i++) {
            cursor = cursor.getNext();
            cursor.setNext(new Node<T>(data.get(i)));
        }
    }

    public int size() {
        Node<T> cursor = head;
        int size = 0;

        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
            size++;
        }

        return size;
    }

    public T get(int index) {
        if (index > size() - 1) return null;

        Node<T> cursor = head;
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        return cursor.getValue();
    }

    public void set(T value, int index) {
        if (index > size() - 1) return;

        Node<T> cursor = head;
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        cursor.setValue(value);
    }

    public void push(T value) {
        head.setValue(value);
        Node<T> first = head;
        head = new Node<T>(first);
    }

    public void append(T value) {
        Node<T> cursor = head;

        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        
        cursor.setNext(new Node<T>(value));
    }

    public void insert(T value, int index) { // doesn't work
        if (index > size() - 1) return;

        Node<T> cursor = head;
        Node<T> next = getNode(index);
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        cursor.set(new Node<T>(value, next));
    }

    public void print() {
        Node<T> cursor = head.getNext();

        System.out.print("[");
        while (cursor != null) { ;
            System.out.printf(
                "%s%s", 
                cursor.getValue(), 
                (cursor.getNext() == null) ? "" : ", "
            );
            cursor = cursor.getNext();
        }
        System.out.print("]");
    }

    public Node<T> getNode(int index) {
        if (index > size() - 1) return null;

        Node<T> cursor = head;
        for (int i = 0; i < index + 1; i++) cursor = cursor.getNext();
        return cursor.copy();
    }

    public Node<T> getTail() {
        Node<T> cursor = head;

        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        
        return cursor;
    }

    public void setTail(Node<T> tail) {
        Node<T> cursor = head;

        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        
        cursor.setNext(tail);
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
} 
