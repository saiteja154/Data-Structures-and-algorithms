package StackAndQueue.ImplementationOfQueueUsingStackCom.PushOperationCostly;

import java.util.Stack;

public class MyQueue {
    Stack< Integer > st1 = new Stack < > ();
    Stack < Integer > st2 = new Stack < > ();
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (st1.empty() == false) {
            st2.push(st1.peek());
            st1.pop();
        }
        // Insert the desired element in the stack input
        System.out.println("The element pushed is " + x);
        st1.push(x);
        // Pop out elements from the stack output and push them into the stack input
        while (st2.empty() == false) {
            st1.push(st2.peek());
            st2.pop();
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // shift input to output
        if (st1.empty()) {
            System.out.println("Stack is empty");

        }
        int val = st1.peek();
        st1.pop();
        return val;

    }

    /** Get the front element. */
    public int peek() {
        // shift input to output
        if (st1.empty()) {
            System.out.println("Stack is empty");

        }
        return st1.peek();
    }


    int size() {
        return st1.size();
    }
    public static void main(String args[]) {
        MyQueue q = new MyQueue();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());

    }
}