package edu.ben.lab_3;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;

    @Override
    public void add(T value) {
        if (this.head == null) {
            this.head = new Node<>(value);
            return;
        }

        Node<T> current = head;
        while (current.hasNext()) {
            current = current.getNext();
        }
        current.setNext(new Node<>(value));
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public T remove() {
        if (this.head == null){
            return null;
        }
        if (!this.head.hasNext()){
            T value = this.head.getValue();
            this.head = null;
            return value;
        }
        Node <T> current = head;
        Node <T> previous = head;
        while (current.hasNext()){
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
        return current.getValue();
    }

    @Override
    public int size() {
        int counter = 0;
        Node<T> current = this.head;
        while (current != null) {
            counter++;
            current = current.getNext();
        }

        return counter;
    }
}

