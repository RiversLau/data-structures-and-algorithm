package com.youxiang.queues;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class PriorityQueue {

    private int size;
    private long[] arr;
    private int nElems;

    public PriorityQueue(int size) {
        this.size = size;
        this.arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {

        int i;
        if (nElems == 0) {
            arr[nElems++] = value;
        } else {
            for (i = nElems - 1; i >= 0; i--) {
                if (value > arr[i]) {
                    arr[i+1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
            nElems++;
        }
    }

    public long remove() {
        return arr[--nElems];
    }

    public long peek() {
        return arr[nElems - 1];
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public boolean isFull() {
        return nElems == size;
    }
}
