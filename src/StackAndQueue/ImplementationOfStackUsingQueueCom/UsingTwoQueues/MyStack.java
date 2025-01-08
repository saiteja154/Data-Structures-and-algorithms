package StackAndQueue.ImplementationOfStackUsingQueueCom.UsingTwoQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> Q1;
    Queue<Integer> Q2;
    public MyStack() {
        Q1=new LinkedList<>();
        Q2=new LinkedList<>();
    }

    public void push(int x) {
        Q2.add(x);
        while(!Q1.isEmpty()){
            Q2.add(Q1.peek());
            Q1.remove();
        }

        Queue<Integer> Q=Q1;//Q is empty Queue;
        Q1=Q2;
        Q2=Q;
        return ;
    }

    public int pop() {
        if(Q1.isEmpty()){
            return -1;
        }
        int x=Q1.peek();
        Q1.remove();
        return x;
    }

    public int top() {
        if(Q1.isEmpty()){
            return -1;
        }
        int x=Q1.peek();
        return x;
    }

    public boolean empty() {
        if(Q1.isEmpty()){
            return true;
        }
        return false;
    }
    public int size(){
        return Q1.size();
    }

    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}