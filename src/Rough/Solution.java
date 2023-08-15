package Rough;

import java.util.Stack;

class checker {
    public static void main(String[] args) {
        ListNode node = new ListNode(100);
        node.next = new ListNode(200);
        node.next.next = new ListNode(300);
        node.next.next.next = new ListNode(400);
        node.next.next.next.next = new ListNode(500);
        node.next.next.next.next.next = new ListNode(600);
        ListNode head = node;
        ListNode neHead = new Solution().solve(head);
        while (neHead != null) {
            System.out.println(neHead.val);
            neHead = neHead.next;
        }
    }
}

public class Solution {
    Stack<ListNode> evenElements = new Stack<>();

    public ListNode solve(ListNode A) {
        ListNode headPosition = A;
        ListNode headPositionFinal = A;
        int count = 1;
        // create stack of even number
        while (headPosition != null) {
            if (count % 2 == 0) {
                ListNode toBePushed = new ListNode(headPosition.val);
                evenElements.push(toBePushed);
            }
            count++;
            headPosition = headPosition.next;
        }

        // check if even number is more than 1 then only reverse else send the original head
        if (evenElements.size() == 1) {
            return A;
        } else {
            // rearrange here
            count = 1;
            while (headPositionFinal != null) {
                if (count % 2 != 0 && !evenElements.isEmpty()) {
                    ListNode poppedNode = evenElements.pop();
                    ListNode nextOfRemovedNode = headPositionFinal.next.next;
                    headPositionFinal.next = poppedNode;
                    headPositionFinal.next.next = nextOfRemovedNode;
                }
                count++;
                headPositionFinal = headPositionFinal.next;
            }
        }
        return A;
    }
}
