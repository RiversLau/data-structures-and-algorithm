package com.youxiang.recursion.stack;

/**
 * @author: Rivers
 * @date: 2018/5/20
 */
public class StackY {

    private int maxSize;
    private int[] statckArr;
    private int top;

    public StackY(int size) {
        this.maxSize = size;
        statckArr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        statckArr[++top] = value;
    }

    public int pop() {
        return statckArr[top--];
    }

    public int peek() {
        return statckArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
