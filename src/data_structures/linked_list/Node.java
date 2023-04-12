package data_structures.linked_list;

public class Node<T> {
   
    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(Node<T> next) {
        this.value = null;
        this.next = next;
    }

    public Node() {
        this.value = null;
        this.next = null;
    }

    public Node<T> copy() {
        return this;
    }

    public void set(Node<T> setter) {
        this.value = setter.getValue();
        this.next = setter.getHead();
    }

    public Node<T> getHead() {
        if (value == null) return this;

        return null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
