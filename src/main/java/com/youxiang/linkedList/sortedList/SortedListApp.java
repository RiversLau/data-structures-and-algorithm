package com.youxiang.linkedList.sortedList;

/**
 * @author: Rivers
 * @date: 2018/5/18
 */
public class SortedListApp {

    public static void main(String[] args) {

        SortedList sortedList = new SortedList();
        sortedList.insert(10);
        sortedList.insert(5);
        sortedList.insert(23);
        sortedList.insert(15);
        sortedList.insert(18);
        sortedList.insert(21);

        sortedList.display();

        System.out.println(sortedList.remove().data);
        System.out.println(sortedList.remove().data);

        sortedList.display();
    }
}
