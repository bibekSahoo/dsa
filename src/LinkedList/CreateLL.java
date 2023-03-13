package LinkedList;

public class CreateLL {
    public static Node createBasicLL(Node head, int size) {
        Node nodeIterate = head;
        while (size > 0) {
            nodeIterate.next = new Node(size * 10);
            nodeIterate = nodeIterate.next;
            size--;
        }
        return head;
    }

    public static void iterateAndPrintLL(Node head) {
        Node nodeIterator = head;
        while (nodeIterator != null) {
            System.out.println("Current node value: " + nodeIterator.value);
            nodeIterator = nodeIterator.next;
        }
    }

    public static void getSizeOfLL(Node head) {
        Node nodeIterator = head;
        int count = 0;
        while (nodeIterator != null) {
            nodeIterator = nodeIterator.next;
            count++;
        }
        System.out.println("Total LL size: " + count);
    }

    public static Node insertNodeAt(Node head, Node nodeToBeInserted, int insertAfter) {
        Node nodeIterator = head;
        int count = 0;
        while (nodeIterator != null) {
            count++;
            if (insertAfter == count) {
                Node temp = nodeIterator.next;
                nodeIterator.next = nodeToBeInserted;
                nodeToBeInserted.next = temp;
                return head;
            } else {
                nodeIterator = nodeIterator.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        head = createBasicLL(head, 5);

        // Iterate and print linked list
        iterateAndPrintLL(head);

        // get size of linked list
        getSizeOfLL(head);

        //insert a node at a position
        head = insertNodeAt(head, new Node(200),3);

        iterateAndPrintLL(head);
    }
}
