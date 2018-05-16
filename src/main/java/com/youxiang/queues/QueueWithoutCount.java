package com.youxiang.queues;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class QueueWithoutCount {

    private int size;
    private long[] arr;
    private int tail;
    private int header;

    public QueueWithoutCount(int size) {
        this.size = size + 1;
        arr = new long[this.size];
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
    }

    public long remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty, can't remove");
        }
        long temp = arr[header++];
        if (header == size) {
            header = 0;
        }
        return temp;
    }

    public long peek() {
        return arr[header];
    }

    public int size() {
        if (tail >= header) {
            return tail - header + 1;
        } else {
            return (size - header) + (tail + 1);
        }
    }

    public boolean isFull() {
        return (tail + 2 == header) || (header + size - 2 == tail);
    }

    public boolean isEmpty() {
        return (tail + 1 == header) || (header + size - 1 == tail);
    }
}
