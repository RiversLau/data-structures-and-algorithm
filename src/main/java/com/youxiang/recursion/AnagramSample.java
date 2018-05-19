package com.youxiang.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/5/19
 */
public class AnagramSample {

    private static int size;
    private static int count;
    private static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word:");
        String input = getInput();
        size = input.length();
        count = 0;
        for (int i = 0; i < size; i++) {
            arrChar[i] = input.charAt(i);
        }
        doAnagram(size);
    }

    private static void doAnagram(int size) {
        if (size == 1) {
            return;
        }
        for (int j = 0; j < size; j++) {
            doAnagram(size - 1);
            if (size == 2) {
                displayWord();
            }
            rotate(size);
        }
    }

    private static void rotate(int current) {
        int j;
        int position = size - current;
        char temp = arrChar[position];
        for (j = position + 1; j < size; j++) {
            arrChar[j - 1] = arrChar[j];
        }
        arrChar[j - 1] = temp;
    }

    private static void displayWord() {
        if (count > 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count + "  ");
        for (int j = 0; j < size; j++) {
            System.out.print(arrChar[j]);
        }
        System.out.print(" ");
        System.out.flush();
        if (count % 6 == 0) {
            System.out.println("");
        }
    }

    private static String getInput() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
