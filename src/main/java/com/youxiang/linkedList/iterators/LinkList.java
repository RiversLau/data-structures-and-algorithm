package com.youxiang.linkedList.iterators;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void show() {
        System.out.print("List(first-->last):");
        if (isEmpty()) {
            System.out.print("Empty list");
        } else {
            Link current = first;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
}
