package com.youxiang.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class BracketApp {

    public static void main(String[] args) throws IOException {

        String input;
        while (true) {
            System.out.print("Enter string containing delimiters:");
            System.out.flush();
            input = getInput();
            if (input == "") {
                break;
            }
            BracketChecker checker = new BracketChecker(input);
            checker.check();
        }
    }

    private static String getInput() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
