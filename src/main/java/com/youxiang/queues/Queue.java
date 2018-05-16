package com.youxiang.queues;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class Queue {

    private int size;
    private long[] arr;

    private int tail;
    private int header;
    private int nElems;

    public Queue(int size) {
        this.size = size;
        arr = new long[size];
        nElems = 0;

        header = 0;
        tail = -1;
    }

    public void insert(long value) {
        if (isFull()) {
            throw new IllegalStateException("Queue full, can't insert");
        }
        if (tail == size - 1) {
            tail = -1;
        }
        arr[++tail] = value;
        nElems++;
    }

    public long remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty, can't remove");
        }

        long temp = arr[header++];
        if (header == size) {
            header = 0;
        }
        nElems--;
        return temp;
    }

    public long peekHeader() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty, can't peek");
        }
        return arr[header];
    }

    public int size() {
        return nElems;
    }

    public boolean isFull() {
        return nElems == size;
    }

    public boolean isEmpty() {
        return nElems == 0;
    }
}
