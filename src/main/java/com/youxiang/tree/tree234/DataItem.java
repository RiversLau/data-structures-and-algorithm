package com.youxiang.tree.tree234;

/**
 * @author: Rivers
 * @date: 2018/9/1
 */
public class DataItem {

    public long dData;

    public DataItem(Long dd) {
        this.dData = dd;
    }

    public void display() {
        System.out.print("/" + dData);
    }
}
