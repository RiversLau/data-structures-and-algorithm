package com.youxiang.sort.advanced.quick;

/**
 * @author: Rivers
 * @date: 2018/5/21
 */
public class QuickArray {

    private long[] arr;
    private int nElems;

    public QuickArray(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    public void dispaly() {
        System.out.print("QuickArray:");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            // 直接将最右侧的元素当做分区元素
            long pivot = arr[right];
            int partition = partitionIndex(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private int partitionIndex(int left, int right, long pivot) {

        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (arr[++leftPtr] < pivot) {
                //不做处理
            }
            while (rightPtr > 0 && arr[--rightPtr] > pivot) {
                //不做处理
            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int left, int right) {
        long temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
