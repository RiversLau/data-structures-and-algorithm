package com.youxiang.recursion;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class TriangularNumberSample01 {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(triangle(n));
    }

    private static int triangle(int n) {
        int total = 0;
        while (n > 0) {
            total = total + n;
            --n;
        }
        return total;
    }
}
