package com.youxiang.stacks;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class Reserver {

    private String input;
    private String output;

    public Reserver(String input) {
        this.input = input;
    }

    public String doReserver() {
        int stackSize = input.length();
        CharStack charStack = new CharStack(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char cha = input.charAt(i);
            charStack.push(cha);
        }
        String output = "";
        while (!charStack.isEmpty()) {
            output += charStack.pop();
        }
        return output;
    }
}
