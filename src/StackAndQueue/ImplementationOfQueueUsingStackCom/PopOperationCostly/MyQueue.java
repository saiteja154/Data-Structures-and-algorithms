package StackAndQueue.ImplementationOfQueueUsingStackCom.PopOperationCostly;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }

    public void push(int x) {
        System.out.println("The element pushed is " + x);
        st1.push(x);

    }

    public int pop() {

        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.peek());
                st1.pop();
            }

        }

        if(st2.isEmpty()){
            return -1;
        }
        else{
            int x=st2.peek();
            st2.pop();
            return x;
        }

    }

    public int peek() {

        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.peek());
                st1.pop();
            }

        }

        if(st2.isEmpty()){
            return -1;
        }
        else{
            int x=st2.peek();
            return x;
        }

    }

    /*
    public boolean empty() {

        if(st2.isEmpty() && st1.isEmpty()){
            return true;
        }
        else{
            return false;
        }


    }*/
    public int size(){
        return st1.size()+st2.size();
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
