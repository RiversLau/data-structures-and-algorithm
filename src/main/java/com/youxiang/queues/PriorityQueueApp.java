package com.youxiang.queues;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class PriorityQueueApp {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue(5);
        pq.insert(100);
        pq.insert(120);
        pq.insert(110);
        pq.insert(150);
        pq.insert(210);

        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
        System.out.println();
    }
}
