package com.youxiang.sort.advanced.shellSort;

/**
 * @author: Rivers
 * @date: 2018/5/21
 */
public class ShellSortArray {

    private long[] arr;
    private int nElems;

    public ShellSortArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void shellSort() {

        int inner, outer;
        long temp;

        int h = 1;
        while (h < nElems / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (outer = h; outer < nElems; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public void display() {
        System.out.print("Array:");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
