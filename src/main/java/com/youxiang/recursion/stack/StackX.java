package com.youxiang.recursion.stack;

/**
 * @author: Rivers
 * @date: 2018/5/20
 */
public class StackX {

    private int maxSize;
    private Param[] stackArr;
    private int top;

    public StackX(int size) {
        this.maxSize = size;
        stackArr = new Param[maxSize];
        top = -1;
    }

    public void push(Param p) {
        stackArr[++top] = p;
    }

    public Param pop() {
        return stackArr[top--];
    }

    public Param peek() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
