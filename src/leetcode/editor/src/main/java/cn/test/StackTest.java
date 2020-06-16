package cn.test;

import java.util.Stack;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/28 8:18
 */
public class StackTest {
    public static void main(String[] args) {
        // \u000d System.out.println("Hello World!");
       Stack<Character> stack = new Stack<>();
        for (int i = 65; i <= 97; i++) {
            stack.push((char)i);
        }

    }
}
