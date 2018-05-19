package com.youxiang.recursion;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class TriangularNumberSample02 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(triangle(n));
    }

    private static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangle(n - 1);
        }
    }
}
