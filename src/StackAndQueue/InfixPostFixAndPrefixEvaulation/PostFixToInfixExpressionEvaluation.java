package StackAndQueue.InfixPostFixAndPrefixEvaulation;

import java.util.Stack;

public class PostFixToInfixExpressionEvaluation {

    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        int len = exp.length();
        for (int i = 0; i < len; i++) {
            char ch = exp.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String A = st.pop();
                String B = st.pop();
                String combined = "(" + B + ch + A + ")";
                st.push(combined);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s = "ab*c+";
        System.out.println("Postfix expression: " + s);
        System.out.print("Infix expression: "+postToInfix(s));
    }
}



/*

Input:
ab*c+
Output:
((a*b)+c)

time complexity : O(N).
Space complexity : O(N).
 */