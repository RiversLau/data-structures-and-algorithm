package com.youxiang.linkedList.stack;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LongLinkedList {

    private LongLink first;

    public LongLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long value) {
        LongLink tmp = new LongLink(value);
        tmp.next = first;
        first = tmp;
    }

    public long deleteFirst() {
        LongLink tmp = first;
        first = tmp.next;
        return tmp.data;
    }

    public void display() {
        LongLink current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println(" ");
    }
}
