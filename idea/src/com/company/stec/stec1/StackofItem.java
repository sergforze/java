package com.company.stec.stec1;

public class StackofItem<Item> {

    private Node first = null;
    int size = 0;

    private class Node {
        Item item;
        Node next;
    }
public Item peek() throws NoSuchFieldException {
        if (isEmpty()) throw new NoSuchFieldException("Stack underflow");
        return first.item;
}

    public void push(Item item) {
        size++;
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Item pop() {
        size--;
        Item item = first.item;
        first = first.next;
        return Item;
    }

    boolean isEmpty() {
        return first == null;
    }
}

