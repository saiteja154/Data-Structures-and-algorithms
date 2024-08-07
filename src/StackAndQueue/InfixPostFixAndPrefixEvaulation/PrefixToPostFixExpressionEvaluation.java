package StackAndQueue.InfixPostFixAndPrefixEvaulation;

import java.util.Stack;

public class PrefixToPostFixExpressionEvaluation {
    static String preToPost(String pre_exp) {
        // code here

        Stack<String> st = new Stack<>();
        int len = pre_exp.length();
        for (int i = len-1; i>=0; i--) {
            char ch = pre_exp.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String A = st.pop();
                String B = st.pop();
                String combined = A + B+ch ;
                st.push(combined);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        System.out.println("Prefix expression: " + s);
        System.out.print("Postfix expression: "+preToPost(s));
    }

}

/*
Input:
*-A/BC-/AKL
Output:
ABC/-AK/L-*

t.c: O(N)
s.c:O(N).
 */