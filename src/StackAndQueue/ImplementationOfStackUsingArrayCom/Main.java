package StackAndQueue.ImplementationOfStackUsingArrayCom;


// Driver code
public class Main {
    public static void main(String args[]) {

        //
        ImplementationOfStackUsingArray s = new ImplementationOfStackUsingArray(100);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
        System.out.println("\n Is the Stack Empty or Not : ---->>>>> " + s.isEmpty());

    }
}