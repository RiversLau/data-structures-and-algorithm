package com.youxiang.search.binary;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class BinarySearch02 {

    public static void main(String[] args) {

        int[] dataList = {20, 31, 45, 55, 79, 80, 88, 100, 121, 153};
        int index = binarySearch(dataList, 55);
        System.out.println(index);
    }

    private static int binarySearch(int[] dataList, int des) {

        int low = 0;
        int high = dataList.length - 1;
        int curIndex;
        while (true) {
            curIndex = (low + high) / 2;
            if (dataList[curIndex] == des) {
                return curIndex;
            } else if (low > high) {
                return -1;
            } else {
                if (dataList[curIndex] < des) {
                    low = curIndex + 1;
                } else {
                    high = curIndex - 1;
                }
            }
        }
    }
}
