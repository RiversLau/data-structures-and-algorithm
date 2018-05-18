package com.youxiang.linkedList.sortedList;

/**
 * @author: Rivers
 * @date: 2018/5/18
 */
public class SortedListFromArray {

    private Link first;

    public SortedListFromArray() {
        first = null;
    }

    public SortedListFromArray(Link[] linkArr) {
        for (Link link : linkArr) {
            insert(link);
        }
    }

    public void insert(Link link) {
        Link current = first;
        Link previous = null;
        while (current != null && link.data > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    public Link remove() {
        Link tmp = first;
        first = first.next;
        return tmp;
    }

    public void display() {
        System.out.print("SortedListFromArray(first-->last):");
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
