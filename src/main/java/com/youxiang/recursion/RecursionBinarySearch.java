package com.youxiang.recursion;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class RecursionBinarySearch {

    private static int[] arr = {20, 31, 45, 55, 79, 80, 88, 100, 121, 153};

    public static void main(String[] args) {

        int result = binarySearch(80, 0, 9);
        System.out.println(result < 0 ? "Can't find" : result);
    }

    private static int binarySearch(int searchKey, int lower, int higher) {

        int current;
        current = (lower + higher) / 2;
        if (arr[current] == searchKey) {
            return current;
        } else if (lower > higher) {
            return -1;
        } else {
            if (arr[current] < searchKey) {
                lower = current + 1;
            } else {
                higher = current - 1;
            }
           return binarySearch(searchKey, lower, higher);
        }
    }
}
