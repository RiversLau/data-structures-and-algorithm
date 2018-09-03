package com.youxiang.hash.linked;

/**
 * @author: Rivers
 * @date: 2018/9/2
 */
public class Link {

    private int iData;
    public Link next;

    public Link (int it) {
        iData = it;
    }

    public int getKey() {
        return iData;
    }

    public void display() {
        System.out.print(iData + " ");
    }
}
