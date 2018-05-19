package com.youxiang.linkedList.doublyLinkedList;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class DoublyLinkedApp {

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(20);
        dll.insertFirst(10);

        dll.insertLast(40);
        dll.insertLast(60);

        dll.insertAfter(40, 50);

        dll.forwardShow();
        dll.backwardShow();

        dll.insertAfter(0, 1);
        dll.insertAfter(10, 15);

        dll.forwardShow();

        dll.deleteFirst();
        dll.deleteKey(20);

        dll.forwardShow();
    }
}
