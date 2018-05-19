package com.youxiang.linkedList.iterators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class IteratorApp {

    public static void main(String[] args) throws IOException {

        LinkList theList = new LinkList();
        Iterator it1 = new Iterator(theList);

        it1.insertAfter(20);
        it1.insertAfter(40);
        it1.insertAfter(80);
        it1.insertBefore(60);

        long value;
        while (true) {
            System.out.print("Enter first letter of show, reset, next, get, before, after, delete:");
            System.out.flush();
            char choice = getChar();
            switch (choice) {
                case 's':
                    theList.show();
                    break;
                case 'r':
                    it1.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty() && !it1.atEnd()) {
                        it1.nextLink();
                    } else {
                        System.out.println("Can't go to next link");
                    }
                    break;
                case 'g':
                    if (!theList.isEmpty()) {
                        value = it1.getCurrent().data;
                        System.out.println("Returned value:" + value);
                    } else {
                        System.out.println("List is empty!");
                    }
                    break;
                case 'b':
                    System.out.print("Enter the value to insert:");
                    System.out.flush();
                    value = getInt();
                    it1.insertBefore(value);
                    break;
                case 'a':
                    System.out.print("Enter the value to insert:");
                    System.out.flush();
                    value = getInt();
                    it1.insertAfter(value);
                    break;
                case 'd':
                    if (!theList.isEmpty()) {
                        value = it1.deleteCurrent();
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Can't delete");
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    private static String getInput() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    private static char getChar() throws IOException {
        String s = getInput();
        return s.charAt(0);
    }

    private static int getInt() throws IOException {
        String s = getInput();
        return Integer.parseInt(s);
    }
}
