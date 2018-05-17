package com.youxiang.linkedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LinkedListApp {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertFirst(22, 2.45);
        list.insertFirst(33, 3.33);
        list.insertFirst(44, 5.45);
        list.insertFirst(55, 7.78);

        list.display();

        Link found = list.find(44);
        if (found != null) {
            System.out.println("Found link with key: " + found.iData + ", " + found.dData);
        } else {
            System.out.println("Can't find link.");
        }

        Link delete = list.delete(66);
        if (delete != null) {
            System.out.println("Delete link with key: " + delete.iData + ", " + delete.dData);
        } else {
            System.out.println("Can't delete link.");
        }
        delete = list.delete(55);
        if (delete != null) {
            System.out.println("Delete link with key: " + delete.iData + ", " + delete.dData);
        } else {
            System.out.println("Can't delete link.");
        }
        System.out.println("=====================================");

        while (!list.isEmpty()) {
            Link remove = list.deleteFirst();
            System.out.print("Deleted ");
            remove.display();
            System.out.println(" ");
        }

        list.display();
    }
}
