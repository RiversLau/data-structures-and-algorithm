package com.youxiang.arrays;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class OrderedArray {

    private long[] arr;
    private int nElems;

    public OrderedArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int low = 0;
        int high = nElems - 1;
        int curIndex;
        while (true) {
            curIndex = (low + high) / 2;
            if (arr[curIndex] == searchKey) {
                return curIndex;
            } else if (low > high) {
                return nElems;
            } else {
                if (arr[curIndex] < searchKey) {
                    low = curIndex + 1;
                } else {
                    high = curIndex - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (arr[j] > value)
                break;
        }
        for (int k = nElems; k > j; k--) {
            arr[k] = arr[k - 1];
        }
        arr[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                arr[k] = arr[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
