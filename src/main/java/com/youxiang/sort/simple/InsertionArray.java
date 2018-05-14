package com.youxiang.sort.simple;

/**
 * @author: Rivers
 * @date: 2018/5/14
 */
public class InsertionArray {

    private long[] arr;
    private int nElems;

    public InsertionArray(int size) {
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
     * 插入排序，
     * 第一次需要进行一次对比，第二次需要两次，依次累加
     * 1+2+3+...+(N-1)=N*(N-1)/2，但并不是每次都进行全量比较，平均下来需要在之前的值再除以2，也就是
     * N*(N-1)/4，这样对比下来，插入排序要比冒泡排序快2倍左右，另外也比选择排序快
     */
    public void insertionSort() {
        int inner, outer;
        for (outer = 1; outer < nElems; outer++) {
            long tmp = arr[outer];
            inner = outer;
            while (inner > 0 && arr[inner - 1] > tmp) {
                arr[inner] = arr[inner - 1];
                --inner;
            }
            arr[inner] = tmp;
        }
    }
}
