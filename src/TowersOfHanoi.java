public class TowersOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) { // Base case
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper); // Step 1
        System.out.println("transfer disk " + n + " from " + src + " to " + dest); // Step 2
        towerOfHanoi(n-1, helper, src, dest); // Step 3
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, "A", "B", "C"); // Solve the problem
    }
}


/*


The Tower of Hanoi
The Tower of Hanoi problem involves moving a stack of disks from one peg to another, following these rules:


Only one disk can be moved at a time.
A disk can only be placed on top of a larger disk or an empty peg.
All disks start on one peg and need to be moved to another peg using an intermediate peg.
For 𝑛=3 disks, the goal is to move all disks from the source peg (A) to the destination peg (C) using the helper peg (B).
image
Explanation
Problem: Move n disks from peg A (source) to peg C (destination) using peg B (helper).


Rules:


Move one disk at a time.
A larger disk cannot be placed on a smaller disk.
Program Breakdown


Main Method:


Initializes the number of disks (n = 3).
Calls towerOfHanoi to solve the puzzle.
towerOfHanoi Method:


Base Case: If there is only 1 disk, move it directly from the source peg to the destination peg.


Recursive Steps:


Move n−1 disks from the source peg to the helper peg.
Move the nth disk from the source peg to the destination peg.
Move the n−1 disks from the helper peg to the destination peg.
 */