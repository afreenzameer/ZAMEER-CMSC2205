package edu.ben.lab_2;

public class MyStringLinkedList implements MyStringList {

    StringNode head;

    public MyStringLinkedList(String value, String expected) {

    }

    public MyStringLinkedList(int value, int expected) {
    }

    public MyStringLinkedList() {

    }


    @Override
    public void add(String value) {
        if (this.head == null) {
            this.head = new StringNode(value);
            return;
        }

        StringNode current = head;
        while (current.hasNext()) {
            current = current.getNext();
        }
        current.setNext(new StringNode(value));

    }


    @Override
    public void clear() {

        this.head = null;
    }

    @Override
    public String remove() {
        if (this.head == null) {
            return null;
        }
        if (!this.head.hasNext()) {
            String value = this.head.getValue();
           this.head = null;
           return value;
        }

        StringNode current = head;
        StringNode p = null;
        while (current.hasNext()) {
            p = current;
            current = current.getNext();
        }
        p.setNext(null);
        return current.getValue();
    }

    @Override
    public int size() {

        StringNode current = head;
        int length = 0;

        while (current != null) {
            current = current.getNext();
            length++;
        }
        return length;

    }


}
