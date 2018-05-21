package com.youxiang.sort.advanced.partition;

/**
 * @author: Rivers
 * @date: 2018/5/21
 */
public class PartitionArray {

    private long[] arr;
    private int nElems;

    public PartitionArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public int partition(long pivot) {

        if (isEmpty()) {
            throw new IllegalStateException("Empty array, can't partition!");
        }

        int left = 0;
        int leftPtr = left - 1;

        int right = size() - 1;
        int rightPtr = right + 1;

        while (true) {
            while (leftPtr < right && arr[++leftPtr] < pivot) {
                //不做处理
            }
            while (rightPtr > left && arr[--rightPtr] > pivot) {
                //不做处理
            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        return leftPtr;
    }

    public int size() {
        return nElems;
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public void display() {
        System.out.print("PartitionArray:");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private void swap(int left, int right) {
        long temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
