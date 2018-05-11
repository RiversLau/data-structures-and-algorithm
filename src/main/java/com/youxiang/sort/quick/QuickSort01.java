package com.youxiang.sort.quick;

/**
 * @author: Rivers
 * @date: 2018/5/11
 */
public class QuickSort01 {

    public static void main(String[] args) {

        int[] dataList = {57, 68, 39, 52, 72, 28, 96, 33, 24 ,19};
        quickSort(dataList, 0, 9);
        for (int temp : dataList) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int middle = getMiddle(data, low, high);
            quickSort(data, low, middle - 1);
            quickSort(data, middle + 1, high);
        }
    }

    private static int getMiddle(int[] dataList, int low, int high) {

        int tmp = dataList[low];
        while (low < high) {
            while (low < high && dataList[high] >= tmp) {
                high--;
            }
            dataList[low] = dataList[high];
            dataList[high] = tmp;
            while (low < high && dataList[low] <= tmp) {
                low++;
            }
            dataList[high] = dataList[low];
            dataList[low] = tmp;
        }
        dataList[low] = tmp;
        return low;
    }
}
