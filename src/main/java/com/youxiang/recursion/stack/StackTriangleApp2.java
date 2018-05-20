package com.youxiang.recursion.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/5/20
 */
public class StackTriangleApp2 {

    private static int theNumber;
    private static int theAnswer;

    private static StackY stack;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle=" + theAnswer);
    }

    private static void stackTriangle() {

        stack = new StackY(10000);
        theAnswer = 0;
        while (theNumber > 0) {
            stack.push(theNumber);
            --theNumber;
        }
        while (!stack.isEmpty()) {
            int n = stack.pop();
            theAnswer += n;
        }
    }

    private static int getInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
}
