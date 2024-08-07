package StackAndQueue.ImplementationOfStackUsingArrayCom;



public class ImplementationOfStackUsingArray {
    int top;
    int array[] ;

    ImplementationOfStackUsingArray(int capacity)
    {
        array=new int[capacity];
        top = -1;
    }

    boolean isEmpty()
    {
        return (top < 0);
    }

    boolean push(int x)
    {
        if (top >= (array.length - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            array[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            int x = array[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            int x = array[top];
            return x;
        }
    }

    void print(){
        for(int i = top;i>=0;i--){
            System.out.print(" "+ array[i]);
        }
    }

}



/*

Problem statement: Implement a stack using an array.

Note: Stack is a data structure that follows the Last In First Out (LIFO) rule.


Explanation:

push(): Insert the element in the stack.
pop(): Remove and return the topmost element of the stack.
top(): Return the topmost element of the stack
size(): Return the number of remaining elements in the stack.


Solution:

Intuition: As we know stack works on the principle of last in first out, so we have to put elements in an array such that it keeps track of the most recently inserted element. Hence we can think of using a Top variable which will help in keeping track of recent elements inserted in the array.

Approach:
Declare an array of particular size.
Define a variable “Top” and initialize it as -1.
push(x): insert element is the array by increasing top by one.
pop(): check whether top is not equal to -1 if it is so, return top and decrease its value by one.
size(): return top+1.

 */