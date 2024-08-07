package BitManipulation;

public class SwapTwpNumbersWithXOR {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println("a Value : " + a+" b value : " +b);

        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("a Value : " + a+" b value : " +b);
    }
}
