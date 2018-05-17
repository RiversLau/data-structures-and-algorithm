package com.youxiang.linkedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class DoubleLink {

    public long data;
    public DoubleLink next;

    public DoubleLink(long data) {
        this.data = data;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
