package com.youxiang.linkedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class DoubleEndedApp {

    public static void main(String[] args) {

        DoubleEndedList dll = new DoubleEndedList();
        dll.insertFirst(22);
        dll.insertFirst(44);
        dll.insertFirst(66);

        dll.insertLast(11);
        dll.insertLast(33);
        dll.insertLast(55);

        dll.display();

        dll.deleteFirst();
        dll.deleteFirst();

        dll.display();
    }
}
