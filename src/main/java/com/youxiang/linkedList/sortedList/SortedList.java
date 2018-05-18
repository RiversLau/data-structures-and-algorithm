package com.youxiang.linkedList.sortedList;

/**
 * @author: Rivers
 * @date: 2018/5/18
 */
public class SortedList {

    private Link first;

    public SortedList() {
        first = null;
    }

    public void insert(long value) {

        Link tmp = new Link(value);
        Link current = first;
        Link previous = null;
        while (current != null && value > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = tmp;
        } else {
            previous.next = tmp;
        }
        tmp.next = current;
    }

    public Link remove() {
        Link tmp = first;
        first = first.next;
        return tmp;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        System.out.print("SortedList(first-->last):");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
        System.out.print("----------------------------------");
        System.out.println();
    }
}
