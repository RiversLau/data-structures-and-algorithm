package com.youxiang.sort.advanced.shellSort;

/**
 * @author: Rivers
 * @date: 2018/5/21
 */
public class ShellSortApp {

    public static void main(String[] args) {

        int maxSize = 10;
        ShellSortArray ssa = new ShellSortArray(maxSize);

        for (int i = 0; i < maxSize; i++) {
            ssa.insert((long) (Math.random() * 99));
        }

        ssa.display();
        ssa.shellSort();

        ssa.display();
    }
}
