package com.example;

import java.util.ArrayList;
import java.util.List;

public class ForPaysend {

    public static boolean removingBrackets(String input) {
        List<Character> brackets = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if ("(){}[]".indexOf(c) != -1) {
                brackets.add(c);
            }
        }
        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < brackets.size() - 1; i++) {
                char a = brackets.get(i), b = brackets.get(i + 1);
                if ((a == '(' && b == ')') ||
                        (a == '{' && b == '}') ||
                        (a == '[' && b == ']')) {
                    brackets.remove(i + 1);
                    brackets.remove(i);
                    changed = true;
                    break;
                }
            }
        } while (changed);

        return brackets.isEmpty();
    }

    public static void main(String[] args) {

        removingBrackets("");

    }

}
