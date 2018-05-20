package com.youxiang.recursion.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/5/20
 */
public class StackTriangleApp {

    private static int theNumber;
    private static int theAnswer;

    private static StackX stack;
    private static int codePart;
    private static Param params;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        recTriangle();
        System.out.println("Triangle=" + theAnswer);
    }

    private static void recTriangle() {
        stack = new StackX(10000);
        codePart = 1;
        while (step() == false) {

        }
    }

    private static boolean step() {
        switch (codePart) {
            case 1:
                params = new Param(theNumber, 6);
                stack.push(params);
                codePart = 2;
                break;
            case 2:
                params = stack.peek();
                if (params.n == 1) {
                    theAnswer = 1;
                    codePart = 5;
                } else {
                    codePart = 3;
                }
                break;
            case 3:
                Param nParam = new Param(params.n - 1, 4);
                stack.push(nParam);
                codePart = 2;
                break;
            case 4:
                params = stack.peek();
                theAnswer = theAnswer + params.n;
                codePart = 5;
                break;
            case 5:
                params = stack.peek();
                codePart = params.returnAddr;
                stack.pop();
                break;
            case 6:
                return true;
        }
        return false;
    }

    private static int getInt() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return Integer.parseInt(s);
    }
}
