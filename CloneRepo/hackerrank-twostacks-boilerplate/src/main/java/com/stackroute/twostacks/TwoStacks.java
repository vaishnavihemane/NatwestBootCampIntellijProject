package com.stackroute.twostacks;

import java.util.Stack;

public class TwoStacks {

    public TwoStacks() {
    }

    //complete the functions for this class using 2 stacks
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<>();
        Stack<T> stackOldestOnTop = new Stack<>();

        public void push(T value) {
            stackNewestOnTop.push(value);
            if(!stackNewestOnTop.isEmpty()){
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }

        }

        public void pop() {
            stackOldestOnTop.pop();

        }

        public Integer peek() {

            return (Integer) stackOldestOnTop.peek();
        }

    }
}
