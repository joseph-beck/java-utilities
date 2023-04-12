package data_structures.linked_list;

class SingleNode<T> {
   
    private T value;
    private SingleNode<T> next;

    public SingleNode(T value, SingleNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public SingleNode(T value) {
        this.value = value;
        this.next = null;
    }

    public SingleNode(SingleNode<T> next) {
        this.value = null;
        this.next = next;
    }

    public SingleNode() {
        this.value = null;
        this.next = null;
    }

    public SingleNode<T> copy() {
        return this;
    }

    public void set(SingleNode<T> setter) {
        this.value = setter.getValue();
        this.next = setter.getHead();
    }

    public SingleNode<T> getHead() {
        if (value == null) return this;

        return null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SingleNode<T> getNext() {
        return this.next;
    }

    public void setNext(SingleNode<T> next) {
        this.next = next;
    }
}
