package StackAndQueue.InfixPostFixAndPrefixEvaulation;

import java.util.Stack;

public class PostFixToPrefixExpressionEvaluation {

    static String postToPre(String post_exp) {


        Stack<String> st = new Stack<>();
        int len = post_exp.length();
        for (int i = 0; i < len; i++) {
            char ch = post_exp.charAt(i);

            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                st.push(String.valueOf(ch));
            } else {
                String A = st.pop();
                String B = st.pop();
                String combined = ch + B + A ;
                st.push(combined);
            }
        }
        return st.pop();

    }

    public static void main(String[] args) {
        String s = "ABC/-AK/L-*";
        System.out.println("Postfix expression: " + s);
        System.out.print("Prefix expression: "+postToPre(s));
    }

}
