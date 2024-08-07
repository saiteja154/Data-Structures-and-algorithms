package StackAndQueue.ImplementationOfStackUsingLinkedListCom;

public class Main {
    public static void main(String args[]) {
        ImplementationOfStackUsingLinkedList s = new ImplementationOfStackUsingLinkedList();
        s.stackPush(10);
        s.stackPush(20);
        s.printStack();
        System.out.println("Element popped " + s.stackPop());
        System.out.println("Stack size: " + s.stackSize());
        System.out.println("Stack is empty or not: " + s.stackIsEmpty());
    }
}