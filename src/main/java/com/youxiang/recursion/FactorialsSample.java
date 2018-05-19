package com.youxiang.recursion;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class FactorialsSample {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorials(n));
    }

    public static long factorials(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorials(n - 1);
        }
    }
}
