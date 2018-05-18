package com.youxiang.linkedList.sortedList;

/**
 * @author: Rivers
 * @date: 2018/5/18
 */
public class Link {

    public long data;
    public Link next;

    public Link(long data) {
        this.data = data;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
