package com.youxiang.linkedList.queue;

import com.youxiang.linkedList.DoubleEndedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LinkedQueue {

    private DoubleEndedList doubleEndedList;

    public LinkedQueue() {
        doubleEndedList = new DoubleEndedList();
    }

    public boolean isEmpty() {
        return doubleEndedList.isEmpty();
    }

    public void insert(long value) {
        doubleEndedList.insertLast(value);
    }

    public void remove() {
        doubleEndedList.deleteFirst();
    }

    public void display() {
        doubleEndedList.display();
    }
}
