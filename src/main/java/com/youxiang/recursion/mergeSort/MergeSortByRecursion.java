package com.youxiang.recursion.mergeSort;

/**
 * 需要花费O(N*logN)时间
 * @author: Rivers
 * @date: 2018/5/20
 */
public class MergeSortByRecursion {

    private static int[] dest = {64, 21, 33, 70, 12, 85, 44, 3, 99, 0, 108, 36};

    public static void main(String[] args) {

        int[] temp = new int[dest.length];
        mergeSort(temp);
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] dest) {
        recMergeSort(dest, 0, dest.length - 1);
    }

    private static void recMergeSort(int[] dest, int lower, int higher) {
        if (lower == higher) {
            return;
        } else {
            int mid = (lower + higher) / 2;
            recMergeSort(dest, lower, mid);
            recMergeSort(dest, mid + 1, higher);
            merge(dest, lower, mid + 1, higher);
        }
    }

    private static void merge(int[] workspace, int lowPtr, int highPtr, int upperBound) {

        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (dest[lowPtr] < dest[highPtr]) {
                workspace[j++] = dest[lowPtr++];
            } else {
                workspace[j++] = dest[highPtr++];
            }
        }
        while (lowPtr <= mid) {
            workspace[j++] = dest[lowPtr++];
        }
        while (highPtr <= upperBound) {
            workspace[j++] = dest[highPtr++];
        }
        for (j = 0; j < n; j++) {
            dest[lowerBound + j] = workspace[j];
        }
    }
}
