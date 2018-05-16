package com.youxiang.queues;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class QueueApp {

    public static void main(String[] args) {

        Queue queue = new Queue(10);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        queue.insert(90);
        queue.insert(100);
        queue.insert(110);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.insert(110);
        queue.insert(120);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}
