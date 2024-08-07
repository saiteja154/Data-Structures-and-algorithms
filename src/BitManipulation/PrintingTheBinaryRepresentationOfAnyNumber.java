package BitManipulation;

public class PrintingTheBinaryRepresentationOfAnyNumber {
    public static void main(String[] args) {
        int x=45;
        System.out.println("Printing the binary representation of any Number.\n");
        for(int i=31;i>=0;i--){
            System.out.print((x>>i)&1);
        }

    }
}
