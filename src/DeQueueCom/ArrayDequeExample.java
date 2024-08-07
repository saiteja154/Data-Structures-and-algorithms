package DeQueueCom;



import java.util.*;
public class ArrayDequeExample {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq
                = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
        System.out.println("\n");






        // Initializing an deque
        Deque<String> dq2
                = new ArrayDeque<String>();

        // add() method to insert
        dq2.add("For");
        dq2.addFirst("Geeks");
        dq2.addLast("Geeks");

        System.out.println(dq2);

        System.out.println(dq2.pop());

        System.out.println(dq2.poll());

        System.out.println(dq2.pollFirst());

        System.out.println(dq2.pollLast());

        System.out.println("\n\n");





        Deque<String> dq1
                = new ArrayDeque<String>();

        // add() method to insert
        dq1.add("For");
        dq1.addFirst("Geeks");
        dq1.addLast("Geeks");
        dq1.add("is so good");

        for (Iterator itr = dq1.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();


    }
}
