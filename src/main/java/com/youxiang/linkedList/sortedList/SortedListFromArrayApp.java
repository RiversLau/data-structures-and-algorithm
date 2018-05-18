package com.youxiang.linkedList.sortedList;

/**
 * @author: Rivers
 * @date: 2018/5/18
 */
public class SortedListFromArrayApp {

    public static void main(String[] args) {

        int size = 10;
        Link[] links = new Link[size];
        for (int i = 0; i < size; i++) {
            int n = (int) (Math.random() * 99);
            Link link = new Link(n);
            links[i] = link;
        }
        for (Link link : links) {
            System.out.print(link.data + " ");
        }
        System.out.println();

        SortedListFromArray sortedList = new SortedListFromArray(links);

        sortedList.display();

        System.out.println(sortedList.remove().data);
        System.out.println(sortedList.remove().data);

        sortedList.display();
    }
}
