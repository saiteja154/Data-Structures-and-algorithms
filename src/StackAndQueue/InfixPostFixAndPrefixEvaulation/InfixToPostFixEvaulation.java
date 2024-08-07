package StackAndQueue.InfixPostFixAndPrefixEvaulation;

import java.util.Stack;

public class InfixToPostFixEvaulation {


   static int Priority(char x){
        switch (x){
            case '-':
            case '+': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String A) {
        int len=A.length();
        StringBuilder result=new StringBuilder();
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<len;i++){
            char ch=A.charAt(i);
            if( (ch>='a') && (ch<='z')){
                result.append(ch);
            }
            else if(ch=='('){
                st1.push(ch);
            }
            else if(ch==')'){
                while( (!st1.isEmpty() ) && (st1.peek()!='(')){
                    result.append(st1.peek());
                    st1.pop();
                }
                st1.pop();
            }
            else {
                while( (!st1.isEmpty() ) && (Priority(ch)<= Priority(st1.peek())) ){
                    result.append(st1.peek());
                    st1.pop();
                }
                st1.push(ch);
            }
        }
        while(!st1.isEmpty()){
            result.append(st1.peek());
            st1.pop();
        }
        return result.toString();
    }





    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        String exp1 = "x^y/(a*z)+b";
        String exp2= "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Infix expression: " + exp);
        System.out.println("Postfix expression: " + infixToPostfix(exp));
    }

}


/*

Infix to Postfix

Problem Statement: Given an infix expression, Your task is to convert the given infix expression to a postfix expression.

Examples:

Example 1:
Input: a+b*(c^d-e)^(f+g*h)-i
Output: abcd^e-fgh*+^*+i-
Explanation: Infix to postfix

Example 2:
Input: (p+q)*(m-n)
Output: pq+mn-*
Explanation: Infix to postfix



Approach: To convert Infix expression to Postfix
1. Scan the infix expression from left to right.

2. If the scanned character is an operand, Print it.

3. Else,

If the precedence of the scanned operator is greater than the precedence of the operator in the stack or the stack is empty or the stack contains a ‘(‘, push the character into the stack.
Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator. After doing that Push the scanned operator to the stack.
4. If the scanned character is an ‘(‘, push it into the stack.

5. If the scanned character is an ‘)’, pop the stack and output it until a ‘(‘ is encountered, and discard both the parenthesis.

6. Repeat steps 2-5 until the entire infix expression is scanned.

7. Print the output.

8. Pop and print the output from the stack until it is not empty.

 */