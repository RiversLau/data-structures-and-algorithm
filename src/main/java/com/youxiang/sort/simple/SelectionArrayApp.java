package com.youxiang.sort.simple;

/**
 * @author: Rivers
 * @date: 2018/5/14
 */
public class SelectionArrayApp {

    public static void main(String[] args) {

        SelectionArray arr = new SelectionArray(10);
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

        arr.selectionSort();
        arr.display();
    }
}
