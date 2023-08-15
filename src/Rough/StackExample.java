package Rough;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<ListNode> stacks = new Stack<>();
        stacks.push(new ListNode(200));
        stacks.push(new ListNode(500));
        stacks.push(new ListNode(599));
        System.out.println(stacks.peek().val);
        System.out.println(stacks.isEmpty());
        System.out.println(stacks.pop().val);
        System.out.println(stacks.peek().val);
        System.out.println(stacks.pop().val);
        System.out.println(stacks.peek().val);
        System.out.println(stacks.pop().val);

    }
}

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}