package com.youxiang.stacks;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class CharStack {

    private int maxSize;
    private char[] chars;
    private int top;

    public CharStack(int maxSize) {
        this.maxSize = maxSize;
        chars = new char[maxSize];
        top = -1;
    }

    public void push(char cha) {
        chars[++top] = cha;
    }

    public char pop() {
        return chars[top--];
    }

    public char peek() {
        return chars[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
