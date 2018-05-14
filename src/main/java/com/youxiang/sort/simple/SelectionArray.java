package com.youxiang.sort.simple;

/**
 * @author: Rivers
 * @date: 2018/5/14
 */
public class SelectionArray {

    private long[] arr;
    private int nElems;

    public SelectionArray(int size) {
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
     * 选择排序，需要N*(N-1)/2次比较，但是只需要进行N次swap操作，相比冒泡排序，在
     * 交换数据方面大大减少
     */
    public void selectionSort() {
        int inner, outer, min;
        for (outer = 0; outer < nElems - 1; outer++) {
            min = outer;
            for (inner = outer + 1; inner < nElems; inner++) {
                if (arr[min] > arr[inner]) {
                    min = inner;
                }
            }
            swap(outer, min);
        }
    }

    private void swap(int one, int two) {
        long tmp = arr[one];
        arr[one] = arr[two];
        arr[two] = tmp;
    }
}
