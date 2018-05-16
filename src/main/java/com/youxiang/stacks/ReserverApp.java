package com.youxiang.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class ReserverApp {

    public static void main(String[] args) throws IOException {

        String input, output;
        while (true) {
            System.out.print("Enter the string:");
            System.out.flush();
            input = getInput();
            if (input == "") {
                break;
            }
            Reserver reserver = new Reserver(input);
            output = reserver.doReserver();
            System.out.println("Reserved String:" + output);
        }
    }

    private static String getInput() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
