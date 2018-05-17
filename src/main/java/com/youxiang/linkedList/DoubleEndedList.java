package com.youxiang.linkedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class DoubleEndedList {

    private DoubleLink first;
    private DoubleLink last;

    public DoubleEndedList() {
        first = null;
        last = null;
    }

    public void insertFirst(long value) {
        DoubleLink tmp = new DoubleLink(value);
        if (isEmpty()) {
            last = tmp;
        }
        tmp.next = first;
        first = tmp;
    }

    public void insertLast(long value) {
        DoubleLink tmp = new DoubleLink(value);
        if (isEmpty()) {
            first = tmp;
        } else {
            last.next = tmp;
        }
        last = tmp;
    }

    public long deleteFirst() {
        if (isEmpty()) {
            return -1;
        }
        long temp = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void display() {
        System.out.print("List(first-->last):");
        DoubleLink current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return first == null;
    }
}
