package com.example.collectionList;

import java.util.Stack;

public class DListDemo {

    public static void main(String[] args) {

        Stack stack1 = new Stack();

        Stack<Integer> stack2 = new Stack<>();

        stack1.add(10);
        stack1.add(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println("Print Stack1 : ");
        System.out.println(stack1);

        System.out.println("LIFO Method : pop()");
        Object obj1=stack1.pop();
        System.out.println(obj1);


    }
}
