package com.youxiang.linkedList.stack;

/**
 * @author: Rivers
 * @date: 2018/5/17
 */
public class LinkedStackApp {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        stack.push(20);
        stack.push(40);
        stack.push(60);

        stack.display();

        stack.push(80);
        stack.push(100);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();
    }
}
