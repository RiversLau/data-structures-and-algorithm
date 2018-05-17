package com.youxiang.linkedList.stack;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LongLink {

    public long data;
    public LongLink next;

    public LongLink(long value) {
        this.data = value;
    }

    public void display() {
        System.out.print(data + " ");
    }
}
