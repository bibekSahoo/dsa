package stack;

/*Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.*/

import java.util.Arrays;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String A = "(){}[]";
        Stack<Character> stack = new Stack<Character>();
        for (char c : A.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                System.out.println(0);;
        }
        System.out.println(stack.isEmpty()? 1: 0);
    }

    public static char getCorrespondingOpen(Character bracket) {
        switch (bracket) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';
        }
        return '0';
    }
}
