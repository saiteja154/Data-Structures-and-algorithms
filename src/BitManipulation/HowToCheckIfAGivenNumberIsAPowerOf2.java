package BitManipulation;

public class HowToCheckIfAGivenNumberIsAPowerOf2 {


   static boolean isPowerOfTwo(int x)
    {
        if(x==0|| x==1){
            return false;
        }
        if( (x & (x - 1))==0 ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x=32;
        int y=36;
        System.out.println(isPowerOfTwo(x) );
        System.out.println(isPowerOfTwo(y) );

    }
}

/*

Properties for numbers which are powers of 2, is that they have one and only
one bit set in their binary representation.
If the number is neither zero nor a power of two, it will have 1 in more than
one place. So if x is a power of 2 then x & (x-1) will be 0.
eg.-> 16-> 10000 and 15 -> 1111
16&15==0


 */