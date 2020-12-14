package com.company;

import java.util.PriorityQueue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<String>();
        stack1.push("Yerevan");
        stack1.push("44");
        stack1.push("Kanada");
        stack2.push("Avstria");
        stack2.push("Kolumbia");
        stack2.push("62");

        System.out.println("The last element is: " + stack1.firstElement());
        System.out.println("The last element is: " + stack1.peek());
        System.out.println("The last element is: " + stack1.pop());
        System.out.println("The last element is: " + stack1.peek());
        System.out.println("The last element is: " + stack2.lastIndexOf(stack2.lastElement()));

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        pQueue.add(84);
        pQueue.add(235);
        pQueue.add(5);
        pQueue.add(99);
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
    }
}
