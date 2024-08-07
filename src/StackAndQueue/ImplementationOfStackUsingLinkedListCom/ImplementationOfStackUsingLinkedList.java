package StackAndQueue.ImplementationOfStackUsingLinkedListCom;


public class ImplementationOfStackUsingLinkedList {
    private class stackNode {
        int data;
        stackNode next;
        stackNode(int d) {
            data = d;
            next = null;
        }
    }
    stackNode top;
    int size;
    ImplementationOfStackUsingLinkedList() {
        this.top = null;
        this.size = 0;
    }
    public void stackPush(int x) {
        stackNode element = new stackNode(x);
        element.next = top;
        top = element;
        System.out.println("Element pushed");
        size++;
    }
    public int stackPop() {
        if (top == null) return -1;
        int topData = top.data;
        stackNode temp = top;
        top = top.next;
        return topData;
    }
    public int stackSize() {
        return size;
    }
    public boolean stackIsEmpty() {
        return top == null;
    }
    public void printStack() {
        stackNode current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}





/*

Implement stack using linked list:


Introduction
Stack is a linear data structure in which elements are stored like a pile, i.e. one on top of another.


Following operations can be performed in the stack:

push(): pushes an element at the top of the stack.
pop(): removes an element from the top of the stack.
size(): returns the size of the stack.
isEmpty(): returns a boolean value for whether the stack is empty or not.
peek()/top(): returns the top element of the stack.
Implementation of stack
The stack can be implemented in two ways:

Statically:  Using arrays
Dynamically: Using a linked list
In this article, we’ll focus more on the implementation of a stack using a linked list.

Approach
Let's focus on each and every operation of the stack and see how we can implement it using a linked list.

We can assume our linked list to be a horizontal stack where the operations like deletion and insertion would
take place at the top of the stack or at the head of the linked list.
To perform all the operations our head of the linked list would act as the top of the stack.



push(): pushing an element at the top of a stack

Pushing the element at the top of the stack would mean the same as pushing an element at the end of the linked list.

We can insert it at the beginning of the linked list using the following steps:

Create a node for our new element.
Point to the next pointer of our element node to point to the head of the linked list.
Make the element node our top node.
Increment the size variable.



pop(): removing an element from the top of a stack

Removing an element from the top of the stack is the same as removing the element from the beginning of our linked list.

The following steps are involved in the pop() method

Check for underflow conditions in the stack.
Store the top node in a temp node and top node data in another variable.
Make the second node of our temp node a top.
Delete temp node.
Return the top node’s data.
*/