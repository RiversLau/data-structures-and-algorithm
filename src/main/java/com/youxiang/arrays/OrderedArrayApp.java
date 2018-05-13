package com.youxiang.arrays;

/**
 * @author: Rivers
 * @date: 2018/5/13
 */
public class OrderedArrayApp {

    public static void main(String[] args) {

        OrderedArray arr = new OrderedArray(100);

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

        int searchKey = 55;
        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        arr.delete(00);
        arr.display();
    }
}
