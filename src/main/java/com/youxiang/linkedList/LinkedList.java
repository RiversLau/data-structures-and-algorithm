package com.youxiang.linkedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LinkedList {

    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int i, double data) {
        Link link = new Link(i, data);
        link.next = first;
        first = link;
    }

    public Link deleteFirst() {
        Link tmp = first;
        first = tmp.next;
        return tmp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {

        Link current = first;
        Link previous = first;
        while (current != null && current.iData != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return null;
        } else if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void display() {
        System.out.print("List(first-->last):");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }
}
