package com.youxiang.stacks;

/**
 * @author: Rivers
 * @date: 2018/5/16
 */
public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int length = input.length();
        CharStack charStack = new CharStack(length);
        for (int i = 0; i < length; i++) {
            char cha = input.charAt(i);
            switch (cha) {
                case '{':
                case '[':
                case '(':
                    charStack.push(cha);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!charStack.isEmpty()) {
                       char chx = charStack.pop();
                       if ((cha == '}' && chx != '{') ||
                               (cha == ']' && chx != '[' ||
                               (cha == ')' && chx != '('))) {
                           System.out.println("Error:" + cha + " at " + i);
                       }
                    } else {
                        System.out.println("Error:" + cha + " at " + i);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!charStack.isEmpty()) {
            System.out.println("Error:missing right delimiter");
        }
    }
}
