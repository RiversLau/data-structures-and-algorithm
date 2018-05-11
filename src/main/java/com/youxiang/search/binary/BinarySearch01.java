package com.youxiang.search.binary;

/**
 * @author: Rivers
 * @date: 2018/5/11
 */
public class BinarySearch01 {

    public static void main(String[] args) {

        int[] dataList = {20, 31, 45, 55, 79, 80, 88, 100, 121, 153};
        int index = binarySearch(dataList, 55);
        System.out.println(index);
    }

    public static int binarySearch(int[] data, int des) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (des == data[mid]) {
                return mid;
            } else if (des < data[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
