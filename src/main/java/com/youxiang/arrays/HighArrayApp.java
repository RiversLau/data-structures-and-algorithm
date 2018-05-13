package com.youxiang.arrays;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class HighArrayApp {

    public static void main(String[] args) {

        HighArray arr = new HighArray(10);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 26;
        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        arr.delete(55);
        arr.delete(66);

        arr.display();
    }
}
