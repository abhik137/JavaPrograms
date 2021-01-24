package com.javaprog.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //Stack<Integer> stack = new ArrayList<Integer>();  // WRONG
        //Stack<Integer> stack = new LinkedList<Integer>(); // WRONG
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        int a = stack.pop();
        System.out.println(a);    // [1, 2, 3, 4] instead of [4, 3, 2, 1]
        System.out.println(stack);
        System.out.println(stack.peek());


    }
}
