package StackAndQueue.InfixPostFixAndPrefixEvaulation;

import java.util.Stack;

public class InfixToPreFixEvaluation {

    static boolean isalpha(char c) {
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    static boolean isdigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    static boolean isOperator(char c) {
        return (!isalpha(c) && !isdigit(c));
    }

    static int getPriority(char C) {
        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;

        return 0;
    }

    // Reverse the letters of the word
    static String reverse(char str[], int start, int end) {

        // Temporary variable to store character
        char temp;
        while (start < end) {

            // Swapping the first and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(str);
    }

    static String infixToPostfix(char[] infix1) {
        System.out.println(infix1);
        String infix = '(' + String.valueOf(infix1) + ')';

        int l = infix.length();
        Stack< Character > char_stack = new Stack < > ();
        String output = "";

        for (int i = 0; i < l; i++) {

            // If the scanned character is an
            // operand, add it to output.
            if (isalpha(infix.charAt(i)) || isdigit(infix.charAt(i)))
                output += infix.charAt(i);

                // If the scanned character is an
                // ‘(‘, push it to the stack.
            else if (infix.charAt(i) == '(')
                char_stack.add('(');

                // If the scanned character is an
                // ‘)’, pop and output from the stack
                // until an ‘(‘ is encountered.
            else if (infix.charAt(i) == ')') {
                while (char_stack.peek() != '(') {
                    output += char_stack.peek();
                    char_stack.pop();
                }

                // Remove '(' from the stack
                char_stack.pop();
            }

            // Operator found
            else {
                if (isOperator(char_stack.peek())) {
                    while ((getPriority(infix.charAt(i)) <
                            getPriority(char_stack.peek()))
                            ||
                            (getPriority(infix.charAt(i)) <=
                                    getPriority(char_stack.peek()) &&
                                    infix.charAt(i) == '^')) {
                        output += char_stack.peek();
                        char_stack.pop();
                    }

                    // Push current Operator on stack
                    char_stack.add(infix.charAt(i));
                }
            }
        }
        while (!char_stack.empty()) {
            output += char_stack.pop();
        }
        return output;
    }

    static String infixToPrefix(char[] infix) {
        /*
         * Reverse String Replace ( with ) and vice versa Get Postfix Reverse Postfix *
         */
        int l = infix.length;
        // Reverse infix
        String infix1 = reverse(infix, 0, l - 1);
        infix = infix1.toCharArray();

        // Replace ( with ) and vice versa
        for (int i = 0; i < l; i++) {

            if (infix[i] == '(') {
                infix[i] = ')';
                i++;
            } else if (infix[i] == ')') {
                infix[i] = '(';
                i++;
            }
        }

        String prefix = infixToPostfix(infix);

        // Reverse postfix
        prefix = reverse(prefix.toCharArray(), 0, prefix.length() - 1);

        return prefix;
    }

    public static void main(String[] args) {
        String s = ("(p+q)*(c-d)");
        System.out.println("Infix expression: " + s);
        System.out.print("Prefix expression: ");
        System.out.print(infixToPrefix(s.toCharArray()));
    }
}




/*

Approach:
First, reverse the infix expression given in the problem.
Scan the expression from left to right.
Whenever the operands arrive, print them.
If the operator arrives and the stack is found to be empty, then simply push the operator into the stack.
If the incoming operator has higher precedence than the TOP of the stack, push the incoming operator into the stack.
If the incoming operator has the same precedence with a TOP of the stack, push the incoming operator into the stack.
If the incoming operator has lower precedence than the TOP of the stack, pop, and print the top of the stack. Test the incoming operator against the top of the stack again and pop the operator from the stack till it finds the operator of lower precedence or same precedence.
If the incoming operator has the same precedence with the top of the stack and the incoming operator is ^, then pop the top of the stack till the condition is true. If the condition is not true, push the ^ operator.
When we reach the end of the expression, pop, and print all the operators from the top of the stack.
If the operator is ')', then push it into the stack.
If the operator is '(', then pop all the operators from the stack till it finds the ‘)’ bracket in the stack.
If the top of the stack is ')', push the operator on the stack.
In the end, reverse the output. And print it.



For evaluation, we evaluate it from left to right. Prefix expressions are also called polish notation.


 */