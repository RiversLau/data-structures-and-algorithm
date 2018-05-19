package com.youxiang.linkedList.iterators;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class Link {

    public long data;
    public Link next;

    public Link(long value) {
        this.data = value;
    }

    public void show() {
        System.out.print(data + " ");
    }
}
