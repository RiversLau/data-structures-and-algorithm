package com.youxiang.stacks;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class StackXApp {

    public static void main(String[] args) {

        StackX stack = new StackX(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            System.out.print(" ");
        }
        System.out.println();
    }
}
