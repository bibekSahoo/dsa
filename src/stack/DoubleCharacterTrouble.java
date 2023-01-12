package stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

/*Remove the first occurrence of the same consecutive characters. eg for a string "abbcd", the first occurrence of same consecutive characters is "bb".

Therefore, the string after this operation will be "acd".*/
public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        String A = "abbcd";
        Stack<Character> stack = new Stack<>();
        for (char eachCharacter : A.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == eachCharacter) {
                stack.pop();
            } else {
                stack.push(eachCharacter);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            char temp = stack.pop();
            result.insert(0,temp);
        }
        System.out.println(result.toString());

    }
}
