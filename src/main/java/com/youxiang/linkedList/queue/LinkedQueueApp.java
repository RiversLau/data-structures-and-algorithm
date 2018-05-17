package com.youxiang.linkedList.queue;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LinkedQueueApp {

    public static void main(String[] args) {

        LinkedQueue queue = new LinkedQueue();
        queue.insert(20);
        queue.insert(40);

        queue.display();

        queue.insert(60);
        queue.insert(80);

        queue.display();

        queue.remove();
        queue.remove();

        queue.display();
    }
}
