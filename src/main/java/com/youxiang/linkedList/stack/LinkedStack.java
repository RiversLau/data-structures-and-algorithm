package com.youxiang.linkedList.stack;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LinkedStack {

    private LongLinkedList linkedList;

    public LinkedStack() {
        this.linkedList = new LongLinkedList();
    }

    public void push(long value) {
        linkedList.insertFirst(value);
    }

    public long pop() {
        return linkedList.deleteFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public void display() {
        linkedList.display();
    }
}
