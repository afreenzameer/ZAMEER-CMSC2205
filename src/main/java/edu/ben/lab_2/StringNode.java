package edu.ben.lab_2;

public class StringNode {

    private StringNode next;
    private String value;

    public StringNode(String value) {this.setValue(value);}

    public void setValue(String value) {this.value = value;}

    public String getValue() {return this.value;}

    public void setNext(StringNode next) {
        this.next = next;
    }

    public StringNode getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

}
