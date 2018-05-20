package com.youxiang.recursion.mergeSort;

/**
 * @author: Rivers
 * @date: 2018/5/20
 */
public class MergeSortSample01 {

    public static void main(String[] args) {

        int[] arrOne = {23, 47, 81, 95};
        int[] arrTwo = {7, 14, 39, 55, 62, 74};
        int[] mergeArr = new int[arrOne.length + arrTwo.length];

        merge(arrOne, arrTwo, mergeArr);
        display(mergeArr);
    }

    private static void merge(int[] arrOne, int[] arrTwo, int[] dest) {

        int oneIndex = 0, twoIndex = 0, destIndex = 0;
        int lengthOne = arrOne.length;
        int lengthTwo = arrTwo.length;
        while (oneIndex < lengthOne && twoIndex < lengthTwo) {
            if (arrOne[oneIndex] < arrTwo[twoIndex]) {
                dest[destIndex++] = arrOne[oneIndex++];
            } else {
                dest[destIndex++] = arrTwo[twoIndex++];
            }
        }
        while (oneIndex < lengthOne) {
            dest[destIndex++] = arrOne[oneIndex++];
        }
        while (twoIndex < lengthTwo) {
            dest[destIndex++] = arrTwo[twoIndex++];
        }
    }

    private static void display(int[] arr) {
        for (int temp : arr) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
