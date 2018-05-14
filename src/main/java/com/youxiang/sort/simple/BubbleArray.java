package com.youxiang.sort.simple;

/**
 * @author: Rivers
 * @date: 2018/5/14
 */
public class BubbleArray {

    private long[] arr;
    private int nElems;

    public BubbleArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 冒泡排序，需要N*(N-1)/2次比较，同时也需要进行N*(N-1)/2交换，也就是swap操作
     */
    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long tmp = arr[one];
        arr[one] = arr[two];
        arr[two] = tmp;
    }
}
