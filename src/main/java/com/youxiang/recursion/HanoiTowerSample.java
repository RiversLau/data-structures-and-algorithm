package com.youxiang.recursion;

/**
 * @author: Rivers
 * @date: 2018/5/20
 */
public class HanoiTowerSample {

    private static int diskCount = 3;

    public static void main(String[] args) {
        doTower(diskCount, 'A', 'B', 'C');
    }

    private static void doTower(int diskCount, char source, char inter, char dest) {
        if (diskCount == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
        } else {
            doTower(diskCount - 1, source, dest, inter);
            System.out.println("Move disk " + diskCount + " from " + source + " to " + dest);
            doTower(diskCount - 1, inter, source, dest);
        }
    }
}
