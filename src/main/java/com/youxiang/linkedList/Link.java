package com.youxiang.linkedList;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class Link {

    public int iData;
    public double dData;
    public Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }

    public void display() {
        System.out.print("{" + iData + ", " + dData + "}");
    }
}
